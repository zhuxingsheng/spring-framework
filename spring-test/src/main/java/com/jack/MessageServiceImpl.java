package com.jack;

import org.springframework.stereotype.Service;

/**
 * Created by jack01.zhu on 2017/5/9.
 */
@Service
public class MessageServiceImpl implements MessageService{

    public MessageServiceImpl(){
        System.err.println("MessageServiceImpl create");
    }

    @Override
    public String getMessage() {
        return "hello msg";
    }
}
