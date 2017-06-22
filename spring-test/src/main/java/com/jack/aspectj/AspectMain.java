package com.jack.aspectj;

import com.jack.MessagePrinter;
import com.jack.aop.Horse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * aspectj主函数
 * Created by jack01.zhu on 2017/6/22.
 */
public class AspectMain {

    static ApplicationContext context;
    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("application-aspectj.xml");

        AspectjHorse me = context.getBean(AspectjHorse.class);
        System.out.println("创建完成");
        me.eat();
    }
}
