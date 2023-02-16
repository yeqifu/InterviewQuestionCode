package com.yeqifu.singleton;

import java.io.Serializable;

/**
 * 单例模式懒汉-双重检查
 *
 * @author: yeqifu
 * @date: 2022/12/22 16:49
 */
public class SingletonForDcl implements Serializable {

    /**
     * 私有化构造器
     */
    private SingletonForDcl() {
        System.out.println("private singletonForDcl");
    }

    private static volatile SingletonForDcl singletonForDcl = null;

    public static SingletonForDcl getInstance() {
        if (null == singletonForDcl) {
            synchronized (SingletonForDcl.class) {
                if (null == singletonForDcl) {
                    singletonForDcl = new SingletonForDcl();
                }
            }
        }
        return singletonForDcl;
    }

    public static void otherMethod() {
        System.out.println("otherMethod()");
    }

}
