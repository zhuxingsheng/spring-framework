package com.jack.transaction;

import com.jack.transaction.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jack01.zhu on 2017/8/9.
 */
public class TransactionTest {

        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext(
                    "application-transaction.xml");
            StudentService studentService = (StudentService) context
                    .getBean("studentService");
            studentService.doComplexLogic();
    }
}
