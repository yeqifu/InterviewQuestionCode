package com.yeqifu;

/**
 * @Author: 落亦-
 * @Date: 2022/2/14 8:44
 */
public class BinarySearchTwoTest {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 6, 8, 423, 3, 6, 4};
        bubble(nums);
        System.out.println("排序后的数组情况：");
        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println();
        int i = binarySearch(nums, -98);
        if (i != -1) {
            System.out.println("已找到目标数字");
        } else {
            System.out.println("未找到目标数字");
        }
        System.out.println(4&7);
    }

    public static void BinarySearchTwoTest(){

    }

    /**
     * 二分法查找
     */
    public static int binarySearch(int[] nums, int target) {
        // 定义左右两个指针，一开始分别指向数组的两个端点
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int center = (left + right) / 2;
            if (nums[center] == target) {
                return 1;
            } else if (nums[center] < target) {
                left = center + 1;
            } else if (nums[center] > target) {
                right = center - 1;
            }
        }
        // 未找到
        return -1;
    }

    /**
     * 冒泡排序
     */
    public static void bubble(int[] nums) {
        // 外层循环决定趟数
        for (int i = 0; i < nums.length - 1; i++) {
            boolean flag = true;
            // 内层循环两两进行比较，因为外层循环没经历了一趟，就确定了一个数的位置
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            // 如果没有进行比较，那么证明已经有序了
            if (flag) {
                break;
            }
        }
    }


}
