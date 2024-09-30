package io.shruubi.leetcode.removeelement;

import io.shruubi.leetcode.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest extends AbstractTest {
    private RemoveElement removeElement;

    @Before
    public void setUp() {
        this.removeElement = new RemoveElement();
    }

    @Test
    public void testExampleOne() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expected = 2;
        int result = removeElement.removeElement(nums, val);
        assertEquals(expected, result);
    }

    @Test
    public void testExampleTwo() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expected = 5;
        int result = removeElement.removeElement(nums, val);
        assertEquals(expected, result);
    }
}