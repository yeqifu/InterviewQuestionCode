package com.yeqifu;

/**
 * 迭代器测试
 *
 * @author: yeqifu
 * @date: 2023/2/11 10:08
 */
public class ForEachTest {
    public static void main(String[] args) {
        String[] strArray = new String[]{"abc", "def", "happy"};
        for (String str : strArray) {
            str = "new";
        }
        for (String str : strArray) {
            System.out.print(str + ",");
        }
    }
}
