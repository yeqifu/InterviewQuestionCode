package com.yeqifu.bravo1988.streamlearn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: yeqifu
 * @date: 2023/2/15 10:29
 */
public class StreamApiTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("李健", 46));
        list.add(new Person("周深", 28));
        list.add(new Person("张学友", 59));

        List<Person> collect = list.stream().filter((person) -> person.getAge() > 40).collect(Collectors.toList());
        for (Person person : collect) {
            System.out.print(person + ",");
        }
    }
}
