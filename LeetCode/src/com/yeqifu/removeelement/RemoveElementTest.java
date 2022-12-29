package com.yeqifu.removeelement;

/**
 * @author: yeqifu
 * @date: 2022/12/28 19:14
 */
public class RemoveElementTest {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeElement(nums, 3);
    }

    public static int removeElement(int[] nums, int val) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                result--;
                nums[i] = 0;
            }
        }
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[i]) {
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }*/
        return result;
    }
}
