# spring初始化顺序总结

通过《spring初始化过程》，《BeanPostProcessor学习》对spring的初始化已经很明了了

![init](http://oirwmbp4e.bkt.clouddn.com/spring/spring-init.jpg)

再写个小代码进行一下验证
```
public class InitBean implements InitializingBean,BeanNameAware,DisposableBean {

    public InitBean(){
        System.out.println("constractor");
    }

    public void initMethod(){
        System.out.println("initMethod");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware"+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public void destroyMethod() {
        System.out.println("destroyMethod");
    }
}
```

```
public class BeanPostProcessorTest implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws
            BeansException {
        System.out.println("postProcessBeforeInitialization"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+beanName);
        return bean;
    }
}
```

```
public class SpringInitTest{
    static ApplicationContext context;
    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("application-init.xml");

        context.getBean(BeanTest.class);

        ((ClassPathXmlApplicationContext)context).close();
    }


}
```

输出
```
constractor
BeanNameAwarecom.jack.init.InitBean#0
postProcessBeforeInitializationcom.jack.init.InitBean#0
afterPropertiesSet
initMethod
postProcessAfterInitializationcom.jack.init.InitBean#0
destroy
destroyMethod
```

输出结果跟理论是一致的

constractor --> 设置属性值 --> aware --> postProcessBeforeInitialization --> afterPropertiesSet --> initMethod --> postProcessAfterInitialization

测试代码：https://github.com/zhuxingsheng/spring-framework/tree/master/spring-test/src/main

