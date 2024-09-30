package io.shruubi.leetcode.stack.ValidParentheses;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * <a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a>
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }

                if (c == ']' && top != '[') {
                    return false;
                }

                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
