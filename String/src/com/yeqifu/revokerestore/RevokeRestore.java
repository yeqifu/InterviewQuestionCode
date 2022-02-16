package com.yeqifu.revokerestore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 撤销/恢复操作具有广泛的用途，比如word文档中输入一个单词，可以点撤销，然后可以再恢复。
 * 编程实现如下功能：
 * 从标准输入读取到一个字符串，字符串可包含0个或多个单词，单词以空格或者tab分隔； 如果遇到 "undo" 字符串，表示"撤销"操作，前一个字符串被撤销掉；
 * 如果遇到"redo"字符串，表示恢复刚才撤销掉的字符串.
 * 例如:   输入字符串 "hello undo redo world."，  对字符串中的 undo 和 redo 处理后， 最终输出的结果为 "hello world."
 *
 * @Author: 落亦-
 * @Date: 2022/1/8 18:31
 */
public class RevokeRestore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = scanner.nextLine();
        System.out.println("input的值为：" + input);
        String[] s = input.split(" |    ");
        for (String s1 : s) {
            System.out.println(s1);
        }

        Stack<String> stringStack = new Stack<>();
        Stack<String> stringStackRedo = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            if (!"undo".equals(s[i]) && !"redo".equals(s[i])) {
                // 元素进入stringStack栈
                stringStack.push(s[i]);
                System.out.println("元素" + s[i] + "进入stringStack栈成功！");

                stringStackRedo.clearStack();

            } else if ("undo".equals(s[i])) {
                if (stringStack.content.size() != 0) {
                    // stringStack进行出栈操作
                    String strPop = stringStack.pop(stringStack.getTopStack());
                    System.out.println("元素" + strPop + "出栈成功");
                    // stringStack进行出栈的元素，进入stringStackRedo栈
                    stringStackRedo.push(strPop);
                }

            } else if ("redo".equals(s[i])) {
                if (stringStackRedo.content.size() != 0) {
                    // stringStackRedo栈进行出栈操作，stringStackRedo进行出栈的元素进入stringStack，
                    String strRedoPop = stringStackRedo.pop(stringStackRedo.getTopStack());

                    // stringStack进行入栈操作
                    String push = stringStack.push(strRedoPop);
                }
            }
        }


        ArrayList<String> content = stringStack.content;
        for (int i = 0; i < content.size(); i++) {
            if (i == content.size()) {
                System.out.print(content.get(i));
            } else {
                System.out.print(content.get(i) + " ");
            }
        }
    }
}

class Stack<String> {
    ArrayList<String> content = new ArrayList<>();

    /**
     * 将字符串str入栈
     *
     * @param str
     */
    public String push(String str) {
        content.add(str);
        return (String) ("元素" + str + "入栈成功！");
    }

    /**
     * 将字符串str出栈
     *
     * @param str
     * @return
     */
    public String pop(String str) {
        // 如果栈中包含字符串str，则删除字符串str，并返回1，表示成功出栈
        if (content.contains(str)) {
            content.remove(str);
            return str;
        }
        // 如果栈中不包含str，出栈失败
        return (String) ("栈中不包含" + str + "，出栈失败");
    }

    /**
     * 得到栈顶元素
     *
     * @return
     */
    public String getTopStack() {
        return content.get(content.size() - 1);
    }

    /**
     * 清空栈中元素
     *
     * @return
     */
    public String clearStack() {
        content.clear();
        return (String) "栈中元素已清空";
    }
}