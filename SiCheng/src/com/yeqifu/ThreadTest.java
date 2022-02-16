package com.yeqifu;

/**
 * 写一个线程，每隔10秒钟标准输出到屏幕上一个”hello world” , 打印10次以后退出
 * @Author: 落亦-
 * @Date: 2020/7/15 15:47
 */
class MainThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        Thread thread = new Thread(mainThread);
        thread.start();
    }
}
