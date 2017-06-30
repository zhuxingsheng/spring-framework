package com.test.enumtest;

/**
 * Created by jack01.zhu on 2017/6/27.
 */
public class EnumMain {


    public static void main(String[] args) {
        try {
            EnumDomain c = EnumDomain.valueOf("C");
        }catch (IllegalArgumentException e) {
            System.out.println("fdas");
        }

        for(EnumDomain d:EnumDomain.values()) {
            if(d.name().equals("A")) {
                System.out.println("A");
            }
        }
    }
}
