package com.yeqifu.bingfa.threadsafe;

import java.util.concurrent.CountDownLatch;

/**
 * 测试volatile关键字的原子性
 * <p>
 * 有人会问volatile不是具有可见性么，方法add()修改了result的值，subtract()方法不会获取它更改后的值么，其实subtract()在add()方法修改result的值之前已经读取了result的值了。所以会导致值不正确，就是volatile不能保证原子性
 * <p>
 * t1 10
 * 0：getstatic    t2 10
                 * 0: getstatic
                 * 3: iconst_5
                 * 4: isub
                 * 5: putstatic
                 * 5
 * 3: iconst_5
 * 4: iadd
 * 5: putstatic
 * 15
 *
 * @author: yeqifu
 * @date: 2022/12/21 20:01
 */
public class AddAndSubtract {

    static volatile int result = 10;

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            add();
            countDownLatch.countDown();
        }).start();

        new Thread(() -> {
            subtract();
            countDownLatch.countDown();
        }).start();
        countDownLatch.await();
        System.out.println("result的值为：" + result);
    }

    public static void add() {
        //result -= 5;
        int b = result;
        b += 5;
        result = b;
    }

    public static void subtract() {
        //result += 5;
        int b = result;
        b -= 5;
        result = b;
    }

}
