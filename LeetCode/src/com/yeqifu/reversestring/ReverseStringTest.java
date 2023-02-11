package com.yeqifu.reversestring;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yeqifu
 * @date: 2023/1/14 23:04
 */
public class ReverseStringTest {
    public static void main(String[] args) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>(16);
        for (Map.Entry<Character, Integer> characterIntegerEntry : ransomNoteMap.entrySet()) {

        }
    }

    public static void reverseString(char[] s) {
        // 使用双指针，left指向左边，right指向右边，然后往中间移动
        for (int left = 0, right = s.length - 1; left < right; ) {
            char temp;
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
