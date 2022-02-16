package com.yeqifu.one;

import java.util.Scanner;

/**
 * 统计一个子串在指定字符串中出现的次数
 * 例如：
 * str = javasdfjavawerjavavsswetjavadfgdfgjavadfgdfbtujava
 * s = java
 * s 在 str里面出现了 6 次
 * @Author: 落亦-
 * @Date: 2020/1/3 20:16
 *
 * 提示：
 * substring(int beginIndex)
 * 返回一个字符串，该字符串是此字符串的子字符串。
 * indexOf(String str)
 * 返回指定子字符串第一次出现的字符串内的索引。
 */
public class SoutStr {

    public static void main(String[] args) {

        System.out.print("请输入一个原字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str);
        System.out.print("请输入指定的字符串：");
        String s = scanner.next();
        System.out.println(s);
        SoutStr test = new SoutStr();
        test.countNum(str,s);
    }

    public void countNum(String str , String s){
        int count = 0;
        System.out.println(str.indexOf(s));
        while (str.indexOf(s)>=0){
            str = str.substring(str.indexOf(s)+s.length());
            count++;
        }
        System.out.println("指定字符串在原字符串中出现了"+count+"次");
    }


}
