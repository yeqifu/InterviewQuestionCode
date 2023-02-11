package com.yeqifu;

/**
 * @author: yeqifu
 * @date: 2023/2/9 21:20
 */
public class QuickSortThreeTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -9, 90, 55};
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }

    public static void quickSort(int[] nums, int begin, int end) {
        // 推出递归循环
        if (begin >= end) {
            return;
        }
        // 得到枢轴的位置
        int pivot = partition(nums, begin, end);
        // 递归左边
        quickSort(nums, begin, pivot - 1);
        // 递归右边
        quickSort(nums, pivot + 1, end);
    }

    private static int partition(int[] nums, int begin, int end) {
        // 定义数组的最后一个元素为枢轴元素
        int pivot = end;
        // 定义两个指针 i 和 j
        int i = begin;
        for (int j = begin; j < end; j++) {
            if (nums[j] < nums[pivot]) {
                int temp;
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        // 交换 pivot 指针和 i 指针指向的元素的位置，确定一个元素最终的位置
        int temp;
        temp = nums[i];
        nums[i] = nums[pivot];
        nums[pivot] = temp;
        return i;
    }
}
