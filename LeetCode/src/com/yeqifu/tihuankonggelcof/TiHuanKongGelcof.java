package com.yeqifu.tihuankonggelcof;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yeqifu
 * @date: 2023/1/15 12:00
 */
public class TiHuanKongGelcof {
    public static void main(String[] args) {
    }

    public static String replaceSpace(String s) {
        // 先将字符串s转换成char[]，然后对char[]扩容，扩容成空格替换成%20的长度
        char[] sForChar = s.toCharArray();
        int count = 0;
        for (char ch : sForChar) {
            if (ch == ' ') {
                count++;
            }
        }
        // 原来的长度加上计数器乘以2就行了，因为本身空格就占了一个长度
        int newLength = sForChar.length + count * 2;
        char[] newChar = new char[newLength];
        // 将旧的字符数组里的字符一个个赋值到新的字符数组里面去
        for (int i = 0; i < sForChar.length; i++) {
            newChar[i] = sForChar[i];
        }
        // 新的字符数组里面，前面和老的字符数据是一样的，只有后面不一样，不一样的地方就是多了空格
        // 使用双指针从后往前遍历新的char[]数组
        for (int left = sForChar.length - 1, right = newLength - 1; left == 0;) {
            if (newChar[left] != ' ') {
                newChar[right] = newChar[left];
                left--;
                right--;
            } else {
                newChar[right--] = '0';
                newChar[right--] = '2';
                newChar[right--] = '%';
                left--;
            }
        }
        return new String(newChar);
    }
}
