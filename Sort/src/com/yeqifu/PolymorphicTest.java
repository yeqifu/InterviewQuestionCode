package com.yeqifu;

/**
 * @Author: 落亦-
 * @Date: 2020/7/14 16:37
 */
public class PolymorphicTest {
    public static void main(String[] args) {
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