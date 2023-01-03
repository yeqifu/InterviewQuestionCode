package com.yeqifu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yeqifu
 * @date: 2023/1/3 21:11
 */
public class InterviewTest {
    public static void main(String[] args) {
        Map<Character, Integer> sMap = new HashMap<>(16);
        for (Map.Entry<Character, Integer> characterIntegerEntry : sMap.entrySet()) {

        }
        Base base = new Sub();
        base.add(1, 2, 3);
        Sub s = (Sub) base;
        s.add(1, 2, 3);
    }
}

class Base {
    public void add(int a, int... arr) {
        System.out.println("base");
    }
}

class Sub extends Base {
    @Override
    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }

    public void add(int a, int b, int c) {
        System.out.println("sub_2");
    }
}