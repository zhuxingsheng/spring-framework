package com.jack.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by jack01.zhu on 2017/7/10.
 */
public class BeanPostProcessorTest implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws
            BeansException {
        System.out.println("postProcessBeforeInitialization  "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization  "+beanName);
        return bean;
    }
}
