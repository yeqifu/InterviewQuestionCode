package com.yeqifu.movezeroes;

/**
 * @Author: 落亦-
 * @Date: 2022/1/16 18:06
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }

    public static void moveZeroes(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
