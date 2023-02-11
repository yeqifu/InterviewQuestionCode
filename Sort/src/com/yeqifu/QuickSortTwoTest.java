package com.yeqifu;

/**
 * @author: yeqifu
 * @date: 2023/2/7 21:20
 */
public class QuickSortTwoTest {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 4, -9, 99, 12};
        quickSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }

    public static void quickSort(int[] nums, int begin, int end) {
        // 退出递归
        if (begin >= end) {
            return;
        }
        // 计算枢轴的位置
        int pivot = partition(nums, begin, end);
        quickSort(nums, begin, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    public static int partition(int[] nums, int begin, int end) {
        // 声明数组的最后一个元素为pivot
        int pivot = end;
        // 将i指针指向数组的第一个元素
        int i = begin;
        // 使用变量j遍历数组元素
        for (int j = begin; j < end; j++) {
            // 如果j小于pivot，那么交换i指针和j指针所指向的元素
            if (nums[j] < nums[pivot]) {
                int temp;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // 向右移动i指针
                i++;
            }
        }
        // 交换pivot指针和i指针所指向的元素，确定一个数的位置
        int temp;
        temp = nums[i];
        nums[i] = nums[pivot];
        nums[pivot] = temp;
        return i;
    }
}


