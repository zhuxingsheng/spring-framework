package com.jack.aop;

import com.jack.MessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AOP 主函数
 * Created by jack01.zhu on 2017/6/22.
 */
public class AopMain {

    static ApplicationContext context;
    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("application.xml");
        Horse me = (Horse) context.getBean("proxy");
        me.eat();
    }
}
