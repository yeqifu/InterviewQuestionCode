package com.yeqifu.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例模式
 *
 * @author: yeqifu
 * @date: 2022/12/22 19:31
 */
public class SingletonForEh implements Serializable {

    /**
     * 私有化构造器
     */
    private SingletonForEh() {
        /**
         * 防止反射破坏单例模式
         */
        if (singletonForEh != null) {
            throw new RuntimeException("单例对象不能重复创建！");
        }
        System.out.println("private SingletonForEh()");
    }

    private static SingletonForEh singletonForEh = new SingletonForEh();

    public static SingletonForEh getInstance() {
        return singletonForEh;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }

    /**
     * 防止反序列化破坏单例
     *
     * @return
     */
    public Object readResolve() {
        return singletonForEh;
    }

}
