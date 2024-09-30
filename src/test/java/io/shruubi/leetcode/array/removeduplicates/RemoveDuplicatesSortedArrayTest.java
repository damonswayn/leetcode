package io.shruubi.leetcode.array.removeduplicates;

import io.shruubi.leetcode.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesSortedArrayTest extends AbstractTest {
    private RemoveDuplicatesSortedArray removeDuplicatesSortedArray;

    @Before
    public void setUp() {
        removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
    }

    @Test
    public void testExampleOne() {
        int[] nums = {1, 1, 2};
        int expectedCount = 2;
        int[] expectedArray = {1, 2, -1};
        int actualCount = removeDuplicatesSortedArray.removeDuplicates(nums);
        assertArrayEquals(expectedArray, nums);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testExampleTwo() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedCount = 5;
        int[] expectedArray = {0, 1, 2, 3, 4, -1, -1, -1, -1, -1};
        int actualCount = removeDuplicatesSortedArray.removeDuplicates(nums);
        assertArrayEquals(expectedArray, nums);
        assertEquals(expectedCount, actualCount);
    }
}