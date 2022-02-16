package com.yeqifu;

import java.util.HashMap;

/**
 * @Author: 落亦-
 * @Date: 2020/7/14 22:45
 */
public class IfTest {
    public static void main(String[] args) {
        Thread t = new Thread() {

            @Override
            public void run() {
                IfTest();
            }
        };

        t.start();
        System.out.print("ping");

    }

    static void IfTest() {

        System.out.print("pong");

    }



}
