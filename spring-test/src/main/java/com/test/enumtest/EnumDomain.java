package com.test.enumtest;

/**
 * Created by jack01.zhu on 2017/6/27.
 */
public enum EnumDomain {

    A("A"),

    B("B");

    private String d;
    private EnumDomain(String d) {
        this.d = d;
    }
}
