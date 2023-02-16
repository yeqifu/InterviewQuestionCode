package com.yeqifu.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: yeqifu
 * @date: 2022/12/22 21:47
 */
public class TestSingleton {
    public static void main(String[] args) throws Exception {
        SingletonInnerClass.otherMethod();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(SingletonInnerClass.getInstance());
        System.out.println(SingletonInnerClass.getInstance());

        // 反射破坏单例
        //reflection(SingletonForEnum.class);

        // 反序列化破坏单例
        serializable(SingletonInnerClass.getInstance());
    }

    /**
     * 通过反序列化创建对象
     *
     * @param instance 类的实例
     * @throws IOException            IO异常
     * @throws ClassNotFoundException 类找不到异常
     */
    private static void serializable(Object instance) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        System.out.println("反序列化创建实例:" + ois.readObject());
    }

    /**
     * 通过反射创建对象
     *
     * @param clazz
     * @throws NoSuchMethodException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    private static void reflection(Class<?> clazz) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        //被private修饰的成员，不能直接使用的，如果用反射强行获取并使用，需要临时取消访问检查
        constructor.setAccessible(true);
        System.out.println("反射创建实例:" + constructor.newInstance());
    }

}
