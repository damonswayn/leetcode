package io.shruubi.leetcode.mergesortedarrays;

import io.shruubi.leetcode.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArraysTest extends AbstractTest {

    private MergeSortedArrays mergeSortedArrays;

    @Before
    public void setUp() {
        mergeSortedArrays = new MergeSortedArrays();
    }

    @Test
    public void testExampleOne() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeSortedArrays.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testExampleTwo() {
        int[] nums1 = {1};
        int[] nums2 = {};
        mergeSortedArrays.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testExampleThree() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        mergeSortedArrays.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }
}