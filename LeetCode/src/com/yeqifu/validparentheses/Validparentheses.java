package com.yeqifu.validparentheses;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 * @Author: 落亦-
 * @Date: 2022/1/27 18:45
 */
public class Validparentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean valid = solution.isValid("");
        System.out.println(valid);
    }
}

class Solution {
    public boolean isValid(String s) {
/*        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c.equals("(")) {
                stack.push(')');
            } else if (c.equals("{")) {
                stack.push('}');
            } else if (c.equals("[")) {
                stack.push(']');
            } else if (stack.empty() || (stack.pop().equals(c))) {
                return true;
            }
        }
        return stack.isEmpty();*/

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        for (Character character : stack) {
            System.out.println(character);
        }
        return stack.isEmpty();
    }

}