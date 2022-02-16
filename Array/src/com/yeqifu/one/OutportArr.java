package com.yeqifu.one;

/**
 * 写一个通用的方法遍历一个二维数组
 * @Author: 落亦-
 * @Date: 2019/12/27 9:40
 */
public class OutportArr {

    public static void main(String[] args) {
        int[][] arrs = {{1}, {2, 4}, {7, 8, 9}};
        printArr2(arrs);
    }

    public static void printArr1(int[][] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                System.out.println(arrs[i][j]);
            }
        }
    }

    public static void printArr2(int[][] arrs) {
        for (int[] arr1 : arrs) {
            for (int arr: arr1) {
                System.out.println(arr);
            }
        }
    }
}

