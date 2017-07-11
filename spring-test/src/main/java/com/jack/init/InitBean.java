package com.jack.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by jack01.zhu on 2017/7/7.
 */
public class InitBean implements InitializingBean,BeanNameAware,DisposableBean {

    public InitBean(){
        System.out.println("constractor");
    }

    private InitAwiredBean initAwiredBean;

    public void setInitAwiredBean(InitAwiredBean initAwiredBean){
        System.out.println("setInitAwiredBean");
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
