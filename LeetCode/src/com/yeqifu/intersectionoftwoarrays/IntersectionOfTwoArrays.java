package com.yeqifu.intersectionoftwoarrays;

import java.util.*;

/**
 * @author: yeqifu
 * @date: 2023/1/4 22:27
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        Integer[] intersection = intersection(nums1, nums2);
        for (Integer integer : intersection) {
            System.out.print(integer + " ");
        }
        Set<Integer> setTwo = new HashSet<>();
        setTwo.stream().mapToInt(x -> x).toArray();
    }

    public static Integer[] intersection(int[] nums1, int[] nums2) {
        // 定义两个map分别放nums1和nums2
        Map<Integer, Integer> mapOne = new HashMap<>(16);
        Map<Integer, Integer> mapTwo = new HashMap<>(16);
        for (int i : nums1) {
            if (mapOne.containsKey(i)) {
                mapOne.put(i, mapOne.get(i) + 1);
            } else {
                mapOne.put(i, 1);
            }
        }

        for (int i : nums2) {
            if (mapTwo.containsKey(i)) {
                mapTwo.put(i, mapTwo.get(i) + 1);
            } else {
                mapTwo.put(i, 1);
            }
        }

        // 遍历mapOne和mapTwo，是否有重复元素
        int mapOneSize = mapOne.size();
        int mapTwoSize = mapTwo.size();
        List<Integer> list = new ArrayList<>();
        for (Integer integer : list) {

        }
        for (Map.Entry<Integer, Integer> entryTwo : mapTwo.entrySet()) {
            for (Map.Entry<Integer, Integer> entryOne : mapOne.entrySet()) {
                if (entryOne.getKey() == entryTwo.getKey()) {
                    list.add(entryOne.getKey());
                }
            }
        }
        return list.toArray(new Integer[list.size()]);
    }
}
