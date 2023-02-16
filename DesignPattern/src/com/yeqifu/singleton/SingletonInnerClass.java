package com.yeqifu.singleton;

import java.io.Serializable;

/**
 * 单例模式-静态内部类
 *
 * @author: yeqifu
 * @date: 2022/12/22 19:34
 */
public class SingletonInnerClass implements Serializable {

    private SingletonInnerClass() {
        System.out.println("private SingletonInnerClass");
    }

    /**
     * 创建静态内部类
     * 内部类可以访问外部类的私有变量，私有的构造方法等
     */
    private static class SingletonHolder {
        static SingletonInnerClass singletonInnerClass = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return SingletonHolder.singletonInnerClass;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }
}
