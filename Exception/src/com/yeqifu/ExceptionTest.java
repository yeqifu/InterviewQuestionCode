package com.yeqifu;

/**
 * @author: yeqifu
 * @date: 2023/2/11 13:48
 */
public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(test());
    }

    private static int test() {
        try {
            int i = 1 / 0;
            System.out.println("产生了异常...");
        } catch (Exception e) {
            System.out.println("捕获了异常...");
            return 1;
        } finally {
            System.out.println("最后的finally中的代码执行了...");
            return 3;
        }
    }
}
