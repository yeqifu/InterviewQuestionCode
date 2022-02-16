package com.yeqifu;

import java.util.ArrayList;

/**
 * 输出小于n的所有质数(1不是质数)
 *
 * @Author: 落亦-
 * @Date: 2022/1/19 10:38
 */
public class PrimeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> integers = printPrimeNumber(100);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers.size());
    }

    public static ArrayList<Integer> printPrimeNumber(int n) {
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 2; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j <= (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                list.add(i);
            }
        }
        return list;
    }
}
