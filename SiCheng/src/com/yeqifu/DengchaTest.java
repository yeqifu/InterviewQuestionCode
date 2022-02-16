package com.yeqifu;

/**
 * 编程实现输出1+2-3+4……-99+100的结果。
 * @Author: 落亦-
 * @Date: 2020/7/15 16:02
 */
public class DengchaTest {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i < 101; i++) {
            if (i%2==0){
                sum=sum+i;
            }else {
                sum=sum-i;
            }
        }
        System.out.println(sum+2);
    }
}
