package io.shruubi.leetcode.array.removeduplicates;

import java.util.HashSet;
import java.util.Set;

/**
 * 26. Remove Duplicates from Sorted Array
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove Duplicates from Sorted Array</a>
 */
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            nums[i] = -1;
        }

        int[] uniqueNumList = set.stream().sorted().mapToInt(i -> i).toArray();

        System.arraycopy(uniqueNumList, 0, nums, 0, set.size());
        return set.size();
    }
}
