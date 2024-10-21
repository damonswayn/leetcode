package io.shruubi.leetcode.string.parsebooleanexpression;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParseBooleanExpression {
    public boolean parseBoolExpr(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            boolean charIsNotSyntax = c != '(' && c != ')' && c != ',';
            if (charIsNotSyntax) {
                stack.push(c);
            } else if (c == ')') {
                int t = 0, f = 0;
                while ((stack.peek() != null && stack.peek() == 't')
                        || (stack.peek() != null && stack.peek() == 'f')) {
                    t += stack.peek() != null && stack.peek() == 't' ? 1 : 0;
                    f += stack.peek() != null && stack.peek() == 'f' ? 1 : 0;
                    stack.pop();
                }

                char op = stack.pop();
                c = 'f';
                if ((op == '!' && f > 0) || (op == '&' && f == 0) || (op == '|' && t > 0)) {
                    c = 't';
                }

                stack.push(c);
            }
        }

        return stack.peek() != null && stack.peek() == 't';
    }
}
