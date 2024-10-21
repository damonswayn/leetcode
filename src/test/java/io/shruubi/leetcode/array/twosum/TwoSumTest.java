package io.shruubi.leetcode.array.twosum;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void exampleOne() {
        var twoSum = new TwoSum();
        var result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void exampleTwo() {
        var twoSum = new TwoSum();
        var result = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        Assert.assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void exampleThree() {
        var twoSum = new TwoSum();
        var result = twoSum.twoSum(new int[]{3, 3}, 6);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }
}
