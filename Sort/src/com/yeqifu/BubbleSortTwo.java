package com.yeqifu;

/**
 * @author: yeqifu
 * @date: 2023/2/5 14:10
 */
public class BubbleSortTwo {
    public static void main(String[] args) {
        // 冒泡排序
        int[] nums = new int[]{4, 11, 2, 1, 6, 9, -19};
        int[] result = bubbleSort(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }

    public static int[] bubbleSort(int[] nums) {
        int s;
        // 外层循环控制次数，一个数组有nums.length个元素，那么只需要遍历nums.length - 1次就行了
        for (int i = 0; i < nums.length; i++) {
            // 内层循环控制两个数的比较，内层循环完一次能够确定一个数字的最终位置
            for (int j = 0; j < nums.length - i -1; j++) {
                int temp;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
