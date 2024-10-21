package io.shruubi.leetcode.array.twosum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int n = nums.length;
        for (i = 1; i < n; i++) {
            for (j = i; j < n; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j - i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
