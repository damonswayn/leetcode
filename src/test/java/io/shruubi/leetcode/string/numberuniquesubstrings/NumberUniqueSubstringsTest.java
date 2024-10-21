package io.shruubi.leetcode.string.numberuniquesubstrings;

import org.junit.Assert;
import org.junit.Test;

public class NumberUniqueSubstringsTest {
    @Test
    public void testExampleOne() {
        var numberUniqueSubstrings = new NumberUniqueSubstrings();
        var numSubStrings = numberUniqueSubstrings.maxUniqueSplit("ababccc");
        Assert.assertEquals(5, numSubStrings);
    }

    @Test
    public void testExampleTwo() {
        var numberUniqueSubstrings = new NumberUniqueSubstrings();
        var numSubStrings = numberUniqueSubstrings.maxUniqueSplit("aba");
        Assert.assertEquals(2, numSubStrings);
    }

    @Test
    public void testExampleThree() {
        var numberUniqueSubstrings = new NumberUniqueSubstrings();
        var numSubStrings = numberUniqueSubstrings.maxUniqueSplit("aa");
        Assert.assertEquals(1, numSubStrings);
    }

    @Test
    public void testExampleFour() {
        var numberUniqueSubstrings = new NumberUniqueSubstrings();
        var numSubStrings = numberUniqueSubstrings.maxUniqueSplit("wwwzfvedwfvhsww");
        Assert.assertEquals(11, numSubStrings);
    }
}
