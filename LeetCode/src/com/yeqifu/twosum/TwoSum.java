package com.yeqifu.twosum;

/**
 * @Author: 落亦-
 * @Date: 2022/1/2 19:25
 */
public class TwoSum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3,2,4};
        int target = 6;
        int[] ints = solution.twoSum(nums, target);
        System.out.print("[");

        for (int anInt : ints) {
            System.out.print(anInt+",");
        }
        System.out.print("]");

    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int one=0;
        int two=0;
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    one = i;
                    two = j;
                }
            }
        }
        result[0] = one;
        result[1] = two;
        return result;
    }
}