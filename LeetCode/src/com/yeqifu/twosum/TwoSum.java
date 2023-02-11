package com.yeqifu.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 落亦-
 * @Date: 2022/1/2 19:25
 */
public class TwoSum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        /*int[] ints = solution.twoSum(nums, target);
        System.out.print("[");

        for (int anInt : ints) {
            System.out.print(anInt+",");
        }
        System.out.print("]");*/

        for (int i : twoSum(nums, target)) {
            System.out.print(i + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // 声明一个map，将nums中的元素放入map中去
        Map<Integer, Integer> map = new HashMap<>(16);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
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