package io.shruubi.leetcode.slidingwindow.minsizesubarrsum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSizeSubarraySumTest {
    private MinimumSizeSubarraySum minimumSizeSubarraySum;

    @Before
    public void setUp() {
        this.minimumSizeSubarraySum = new MinimumSizeSubarraySum();
    }

    @Test
    public void testExampleOne() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int expected = 2;
        int result = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExampleTwo() {
        int target = 4;
        int[] nums = {1, 4, 4};
        int expected = 1;
        int result = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExampleThree() {
        int target = 11;
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        int result = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        assertEquals(expected, result);
    }
}