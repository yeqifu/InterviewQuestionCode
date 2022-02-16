package com.yeqifu;

/**
 * @Author: 落亦-
 * @Date: 2022/1/30 8:52
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 7, 4, 6, 0};
        bubble(nums);
        System.out.println("对数组元素进行排序：");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        binarySearch(nums,0);
    }

    /**
     * 冒泡排序
     *
     * @param nums
     */
    public static void bubble(int[] nums) {
        // 外层循环nums.length个元素只需要比较 nums.length - 1 次
        for (int i = 0; i < nums.length - 1; i++) {
            int temp;
            boolean flag = true;
            // 外层循环每经历过一次，就确定了一个数的位置，内层循环就可以减少一次，外层循环经历过了i次，内层循环就可以减少i次
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            // 如果有一次循环没有交换两个数，那么代表这个数组已经有序了，那么就可以直接退出循环
            if (flag) {
                break;
            }
        }
    }

    /**
     * 二分法查找元素
     *
     * @param nums   已经排好序的数组
     * @param target 目标值
     */
    public static void binarySearch(int[] nums, int target) {
        // 定义左右两个指针
        int left = 0;
        int right = nums.length - 1;
        for (; left <= right; ) {
            int middle = (left + right) / 2;
            // 目标值比中间值大
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else if (target == nums[middle]) {
                System.out.println("找到" + target + ",它在数据中的下标为：" + middle);
                break;
            }

        }
        if (left > right) {
            System.out.println("未找到：" + target);
        }

    }
}




















