package com.yeqifu.ransomnote;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yeqifu
 * @date: 2023/1/11 23:18
 */
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        // 声明两个hashMap，然后遍历字符串，map中key存放字符，value存放该字符出现的次数
        Map<Character, Integer> mapOne = new HashMap<>(16);
        Map<Character, Integer> mapTwo = new HashMap<>(16);
        for (int i = 0; i < ransomNote.length(); i++) {
            if (mapOne.containsKey(ransomNote.charAt(i))) {
                mapOne.put(ransomNote.charAt(i), mapOne.get(ransomNote.charAt(i)) + 1);
            } else {
                mapOne.put(ransomNote.charAt(i), 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (mapTwo.containsKey(magazine.charAt(i))) {
                mapTwo.put(magazine.charAt(i), mapTwo.get(magazine.charAt(i)) + 1);
            } else {
                mapTwo.put(magazine.charAt(i), 1);
            }
        }
        // 遍历mapOne和mapTwo，判断mapOne能否由mapTwo组成
        for (Map.Entry<Character, Integer> entryOne : mapOne.entrySet()) {
            for (Map.Entry<Character, Integer> entryTwo : mapTwo.entrySet()) {
                if (entryOne.getKey().equals(entryTwo.getKey())) {
                    if (entryOne.getValue() > (entryTwo.getValue())) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
