package com.jack.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by jack01.zhu on 2017/6/20.
 */
public class AopLogger implements MethodBeforeAdvice, AfterReturningAdvice {

    @Override public void before(Method method, Object[] args, Object target) throws Throwable {
        System.err.println("before............");
    }

    @Override public void afterReturning(Object returnValue, Method method, Object[] args,
            Object target) throws Throwable {

        System.err.println("afterReturning............");

    }
}
