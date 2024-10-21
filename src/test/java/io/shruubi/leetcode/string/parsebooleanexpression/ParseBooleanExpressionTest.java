package io.shruubi.leetcode.string.parsebooleanexpression;

import org.junit.Assert;
import org.junit.Test;

public class ParseBooleanExpressionTest {
    @Test
    public void exampleOne() {
        var parseBooleanExpression = new ParseBooleanExpression();
        var result = parseBooleanExpression.parseBoolExpr("&(|(f))");
        Assert.assertFalse(result);
    }

    @Test
    public void exampleTwo() {
        var parseBooleanExpression = new ParseBooleanExpression();
        var result = parseBooleanExpression.parseBoolExpr("|(f,f,f,t)");
        Assert.assertTrue(result);
    }

    @Test
    public void exampleThree() {
        var parseBooleanExpression = new ParseBooleanExpression();
        var result = parseBooleanExpression.parseBoolExpr("!(&(f,t))");
        Assert.assertTrue(result);
    }

    @Test
    public void exampleFour() {
        var parseBooleanExpression = new ParseBooleanExpression();
        var result = parseBooleanExpression.parseBoolExpr("!(f)");
        Assert.assertTrue(result);
    }

    @Test
    public void exampleFive() {
        var parseBooleanExpression = new ParseBooleanExpression();
        var result = parseBooleanExpression.parseBoolExpr("|(f,t)");
        Assert.assertTrue(result);
    }

    @Test
    public void exampleSix() {
        var parseBooleanExpression = new ParseBooleanExpression();
        var result = parseBooleanExpression.parseBoolExpr("|(&(t,f,t),t)");
        Assert.assertTrue(result);
    }

    @Test
    public void exampleSeven() {
        var parseBooleanExpression = new ParseBooleanExpression();
        var result = parseBooleanExpression.parseBoolExpr("|(&(t,f,t),!(t))");
        Assert.assertFalse(result);
    }
}
