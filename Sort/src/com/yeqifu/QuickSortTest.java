package com.yeqifu;

import java.util.Arrays;

/**
 * @Author: 落亦-
 * @Date: 2022/2/16 11:23
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] nums = {3,1,6,9,21,56,22};
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num+",");
        }
    }

    private static void quickSort(int[] nums,int begin, int end) {

        if (begin >= end) {
            return;
        }
        int pivot = partition(nums, begin, end);
        // 递归左边的分区
        quickSort(nums, begin, pivot - 1);
        // 递归右边的分区
        quickSort(nums, pivot + 1, end);
    }

    private static int partition(int[] nums, int begin, int end) {
        int pivot = end;
        int i = begin;
        for (int j = begin; j < end; j++) {
            if (nums[j] < nums[pivot]) {
                int temp;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        // 交换指针i指向的元素和基准点元素
        int temp;
        temp = nums[i];
        nums[i] = nums[pivot];
        nums[pivot] = temp;
        System.out.println(Arrays.toString(nums) + " i=" + i);
        return i;
    }

}
