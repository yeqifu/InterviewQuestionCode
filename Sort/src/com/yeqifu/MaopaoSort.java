package com.yeqifu;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @Author: 落亦-
 * @Date: 2020/7/13 9:56
 */
public class MaopaoSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 88, 15, 99, 36, 105};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
