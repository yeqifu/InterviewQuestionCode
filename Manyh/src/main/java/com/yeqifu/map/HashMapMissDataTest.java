package com.yeqifu.map;

import java.util.HashMap;

/**
 * @author: yeqifu
 * @date: 2023/1/2 17:59
 */
public class HashMapMissDataTest {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, Object> hashMap = new HashMap<>(16);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // a的ascii码是 97      97 & （16-1） ->  1
                hashMap.put("a", new Object());
            }
        }, "t1");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 1的ascii码是 49      49 & （16-1） ->  1
                hashMap.put("1", new Object());
            }
        }, "t2");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(hashMap);
    }
}
