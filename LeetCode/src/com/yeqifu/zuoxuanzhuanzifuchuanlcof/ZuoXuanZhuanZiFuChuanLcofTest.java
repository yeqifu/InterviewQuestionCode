package com.yeqifu.zuoxuanzhuanzifuchuanlcof;

/**
 * @author: yeqifu
 * @date: 2023/1/15 13:49
 */
public class ZuoXuanZhuanZiFuChuanLcofTest {
    public static void main(String[] args) {
        String s = "abcdefg";
        int n = 2;
        System.out.println(reverseLeftWords(s, n));
    }

    public static String reverseLeftWords(String s, int n) {
        // 先将字符串转换成char[]数组
        char[] chars = s.toCharArray();
        // 将左边的字符取出来放入left数组中
        char[] left = new char[n];
        for (int i = 0; i < n; i++) {
            left[i] = chars[i];
        }
        // 将chars数组中，n后面的所有字符都重新排列
        for (int i = 0; n < s.length(); i++) {
            chars[i] = chars[n];
            n++;
        }
        // 再将left数组中的所有元素都放入chars数组中的末尾

        for (int i = s.length() - n, j = 0; i < chars.length; i++) {
            chars[i] = left[j];
            j++;
        }
        return new String(chars);
    }
}
