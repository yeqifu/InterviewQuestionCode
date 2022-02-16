package com.yeqifu.one;

import java.util.Scanner;

/**
 * 问题：求一个数的阶乘
 * @Author: 落亦-
 * @Date: 2019/12/24 13:12
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println("请输入想要计算该数字的阶乘：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Factorial factorial = new Factorial();
//        int r = factorial.factorialOne(n);

        int r = factorial.factorialTwo(n);
        System.out.println("阶乘结果为："+r);
    }

    /**
     * 普通方式求阶乘
     * @param s     需要求阶乘的数
     * @return      结果
     */
    public int factorialOne(Integer s){
        int m=s;
        int r=1;
        for (int i = 1; i <= m; i++) {
            r=r*i;
        }
        return r;
    }

    /**
     * 递归的方式求阶乘
     * @param s     需要求阶乘的数
     * @return      结果
     */
    public int factorialTwo(Integer s){
        if (1==s){
            return 1;
        }else {
            return s*factorialTwo(s-1);
        }

    }

}
