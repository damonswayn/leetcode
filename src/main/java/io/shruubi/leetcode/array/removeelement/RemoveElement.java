package io.shruubi.leetcode.array.removeelement;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 27. Remove Element
 * <a href="https://leetcode.com/problems/remove-element/">Remove Element</a>
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        AtomicInteger nonMatchCtr = new AtomicInteger();
        int[] result = Arrays.stream(nums)
                .filter(num -> {
                    nonMatchCtr.addAndGet(num != val ? 1 : 0);
                    return num != val;
                })
                .toArray();

        System.arraycopy(result, 0, nums, 0, result.length);
        return nonMatchCtr.get();
    }
}
