package com.yeqifu.threesum;

import java.util.*;

/**
 * @Author: 落亦-
 * @Date: 2022/1/29 12:04
 */
public class ThreeSumTest {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists.toString());

        List<List<Integer>> lists1 = threeSumv2(nums, 0);
        System.out.println(lists1.toString());
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        // 相对数组中的数据进行排序
        Arrays.sort(nums);
        // 定义左右两个指针，一开始分别指向数组的两端
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int d = 0 - nums[i];
            for (int left = i + 1, right = nums.length - 1; left < nums.length; left++) {
                // right指针左移 两个指针指向的数据相加大于一开始固定的数据的负数
                while ((nums[left] + nums[right]) > d && left < right) {
                    right--;
                }
                // 左右指针汇聚到一起，退出当前循环
                if (left == right) {
                    break;
                }
                // 如果两个指针指向的数据之和等于一开始固定的数据的负数，那么就找到了一个三元组
                if ((nums[left] + nums[right]) == d) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSumv2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        //大循环
        for (int i = 0; i < nums.length; i++) {
            int d = target - nums[i];
            // j和k双指针循环定位，j在左端，k在右端
            for (int j=i+1,k=nums.length-1; j<nums.length; j++) {
                // k指针向左移动
                while (j<k && (nums[j]+nums[k])>d) {
                    k--;
                }
                //双指针重合，跳出本次循环
                if (j == k) {
                    break;
                }
                if (nums[j] + nums[k] == d) {
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    resultList.add(list);
                }
            }
        }
        return resultList;
    }

    /*public List<List<Integer>> threeSum(int[] nums) {
        // 暴力法：三个指针，固定i指针和j指针，然后移动k指针，当k指针到末尾了就移动j指针，当j指针到末尾了，就移动i指针
        // 暴力法（覃超）：a + b = -target
        List<Integer> innerList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j< nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] + nums[j] == -nums[k]) {
                        // 把innerList中的元素移除
                        innerList.clear();
                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[k]);
                        result.add(innerList);
                    }
                }
            }
        }
        return result;
    }*/
}
