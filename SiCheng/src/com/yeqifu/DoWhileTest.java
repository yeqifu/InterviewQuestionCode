package com.yeqifu;

/**
 * @Author: 落亦-
 * @Date: 2020/7/15 10:39
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        do {
            --c;
            a=a-1;
        }while (a>0);
        System.out.println(a);
    }
}
