package com.jack;

/**
 * Created by jack01.zhu on 2017/5/2.
 */
import com.test.spring.SpringBeanTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Application {


    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        SpringBeanTest springBeanTest = context.getBean(SpringBeanTest.class);
        springBeanTest.print();

    }
}
