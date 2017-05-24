package com.jack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jack01.zhu on 2017/5/2.
 */
@Component
public class MessagePrinter {

    private final static Logger LOGGER = LoggerFactory.getLogger(MessagePrinter.class);

    private MessageService service;

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    public MessagePrinter(){
        System.err.print("------------");

        LOGGER.info("create messageprinter");
    }

    public void printMessage() {
        System.out.println("print message");
//        System.out.println(this.service.getMessage());
    }
}
