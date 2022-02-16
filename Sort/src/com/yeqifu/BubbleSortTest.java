package com.yeqifu;

/**
 * 冒泡排序
 *
 * @Author: 落亦-
 * @Date: 2022/1/29 19:56
 */
public class BubbleSortTest {
    int b;

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 2, 4};
        int a;
        bubbleSort(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }

    public static void bubbleSort(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }
}

