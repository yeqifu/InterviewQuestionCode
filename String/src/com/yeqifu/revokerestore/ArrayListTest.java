package com.yeqifu.revokerestore;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author: 落亦-
 * @Date: 2022/1/11 15:20
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));
    }
}
