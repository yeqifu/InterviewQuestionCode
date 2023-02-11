package com.yeqifu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yeqifu
 * @date: 2023/2/11 10:21
 */
public class QueueForListTest {
    public static void main(String[] args) {
        QueueForList queueForList = new QueueForList();
        queueForList.add("a");
        queueForList.add(1);
        queueForList.add(1.9f);
        queueForList.add("happy");
        Object one = queueForList.poll();
        System.out.println(one);
        Object two = queueForList.poll();
        System.out.println(two);
    }
}

class QueueForList<T> {
    private List<T> arrayList = new ArrayList<>();

    /**
     * 将元素入队
     *
     * @param t
     */
    public void add(T t) {
        arrayList.add(t);
    }

    /**
     * 将元素出队
     *
     * @return
     */
    public T poll() {
        if (null != arrayList && arrayList.size() > 0) {
            return arrayList.remove(0);
        }
        return null;
    }

}
