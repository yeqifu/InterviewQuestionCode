package com.yeqifu;

import java.lang.reflect.Constructor;

/**
 * @Author: 落亦-
 * @Date: 2020/7/14 15:05
 */
public class SwitchTest implements Cloneable {
    public static int getValue(int i){
        int result=0;
        switch (i){
            case 1:
                result = result + i;
            case 2:
                result = result + i*2;
            case 3:
                result = result + i*3;
            case 4:
                result = result + 9;
        }
        return result;
    }

    public SwitchTest() {
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getValue(2));
        //通过Class来实现创建对象
        SwitchTest switchTest = SwitchTest.class.newInstance();
        System.out.println(switchTest);
        //通过Constructor来创建对象
        Constructor<SwitchTest> constructor = SwitchTest.class.getConstructor();
        SwitchTest switchTest1 = constructor.newInstance();
        System.out.println(switchTest1);

        switchTest=switchTest1;
        System.out.println(switchTest==switchTest1);

        SwitchTest switchTest2 = (SwitchTest) switchTest.clone();
        System.out.println(switchTest2);
    }
}
