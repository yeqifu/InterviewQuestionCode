package com.yeqifu.singleton;

/**
 * 饿汉式单例模式-枚举
 *
 * @author: yeqifu
 * @date: 2022/12/26 12:06
 */
enum SingletonForEnum {
    /**
     * 饿汉式单例模式
     */
    INSTANCE;

    SingletonForEnum() {
        System.out.println("private SingletonForEnum");
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public static SingletonForEnum getInstance() {
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }
}
