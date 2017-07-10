package com.jack.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by jack01.zhu on 2017/7/7.
 */

public class SpringInitTest{
    static ApplicationContext context;
    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("application-init.xml");

        context.getBean(BeanTest.class);

        ((ClassPathXmlApplicationContext)context).close();
    }


}
