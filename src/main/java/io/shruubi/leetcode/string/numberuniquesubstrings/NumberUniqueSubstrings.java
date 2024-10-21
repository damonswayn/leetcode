package io.shruubi.leetcode.string.numberuniquesubstrings;

import java.util.HashSet;
import java.util.Set;

public final class NumberUniqueSubstrings {
    private final Set<String> visited;

    public NumberUniqueSubstrings() {
        this.visited = new HashSet<>();
    }

    public int maxUniqueSplit(String s) {
        return this.search(s, 0, 0);
    }

    private int search(String str, int startIndex, int splitCount) {
        if (startIndex >= str.length()) {
            return splitCount;
        }

        int maxSplits = 0;
        for (int endIndex = startIndex + 1; endIndex <= str.length(); ++endIndex) {
            String subString = str.substring(startIndex, endIndex);
            if (visited.add(subString)) {
                maxSplits = Math.max(maxSplits, this.search(str, endIndex, splitCount + 1));
                this.visited.remove(subString);
            }
        }

        return maxSplits;
    }
}
