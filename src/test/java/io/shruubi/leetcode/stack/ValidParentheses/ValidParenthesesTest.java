package io.shruubi.leetcode.stack.ValidParentheses;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @Before
    public void setUp() {
        this.validParentheses = new ValidParentheses();
    }

    @Test
    public void testExampleOne() {
        String s = "()";
        boolean expected = true;
        boolean result = validParentheses.isValid(s);
        assertEquals(expected, result);
    }

    @Test
    public void testExampleTwo() {
        String s = "()[]{}";
        boolean expected = true;
        boolean result = validParentheses.isValid(s);
        assertEquals(expected, result);
    }

    @Test
    public void testExampleThree() {
        String s = "(]";
        boolean expected = false;
        boolean result = validParentheses.isValid(s);
        assertEquals(expected, result);
    }
}