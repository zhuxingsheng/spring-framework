package com.jack.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by jack01.zhu on 2017/7/7.
 */
public class InitBean implements InitializingBean,BeanPostProcessor,BeanNameAware {

    public InitBean(){
        System.out.println("constractor");
    }

    public void initMethod(){

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws
            BeansException {
        System.out.println("postProcessBeforeInitialization"+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+beanName);
        return bean;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware"+name);
    }
}
