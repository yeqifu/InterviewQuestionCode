package com.yeqifu.validanagram;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yeqifu
 * @date: 2023/1/3 23:18
 */
public class ValidAnagramSolution {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        // 声明一个sMap，key为字符串的字符，value为该字符出现的次数，将字符串s的每一个字符放入sMap中
        Map<Character, Integer> sMap = new HashMap<>(16);
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                int sum = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), sum + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
        }

        // 声明一个tMap，key为字符串的字符，value为该字符出现的次数，将字符串t的每一个字符放入tMap中
        Map<Character, Integer> tMap = new HashMap<>(16);
        for (int i = 0; i < t.length(); i++) {
            if (tMap.containsKey(t.charAt(i))) {
                int sum = tMap.get(t.charAt(i));
                tMap.put(t.charAt(i), sum + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }

        // 看是sMap的长度大还是tMap的长度大，挑选长度大的遍历，遍历sMap，看sMap中的
        int sMapSize = sMap.size();
        int tMapSize = tMap.size();
        boolean flag = true;
        if (sMapSize >= tMapSize) {
            for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
                if (tMap.containsKey(entry.getKey())) {
                    if (!tMap.get(entry.getKey()).equals(entry.getValue())) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
        } else {
            for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
                if (sMap.containsKey(entry.getKey())) {
                    if (!sMap.get(entry.getKey()).equals(entry.getValue())) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
