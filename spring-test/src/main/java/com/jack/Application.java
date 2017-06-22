package com.jack;

/**
 * Created by jack01.zhu on 2017/5/2.
 */
import com.jack.aop.Horse;
import com.test.spring.SpringBeanTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Application {

    static ApplicationContext context;
    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(Application.class);

        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        MessagePrinter printer1 = context.getBean(MessagePrinter.class);
        printer1.printMessage();

        SpringBeanTest springBeanTest = context.getBean(SpringBeanTest.class);
        springBeanTest.print();

    }
}
