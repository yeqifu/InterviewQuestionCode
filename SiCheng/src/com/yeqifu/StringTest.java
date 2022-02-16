package com.yeqifu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 落亦-
 * @Date: 2020/7/14 22:23
 */

public class StringTest {
    @Test
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1,"b");
        String s = (String) list.get(1);
        System.out.println(s);
    }
}
