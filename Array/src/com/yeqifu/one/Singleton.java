package com.yeqifu.one;

/**
 * 使用双重校验锁实现单例对象（线程安全）
 *
 * @Author: 落亦-
 * @Date: 2020/1/3 22:07
 */
public class Singleton {

    public static void main(String[] args) {
        Singleton uniqueInstance = Singleton.getUniqueInstance();
        System.out.println(uniqueInstance);
    }

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getUniqueInstance() {
        //先判断对象是否已经实例过，没有实例化过才进入加锁代码
        if (uniqueInstance == null) {
            //类对象加锁
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}