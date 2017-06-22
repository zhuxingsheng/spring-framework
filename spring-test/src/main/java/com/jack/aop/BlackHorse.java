package com.jack.aop;

/**
 * Created by jack01.zhu on 2017/6/20.
 */
public class BlackHorse implements Horse {
    @Override public void eat() {
        System.err.println("black horse eat");
    }
}
