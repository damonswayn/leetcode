package io.shruubi.leetcode.mergesortedarrays;

public class MergeSortedArrays {

    public void merge(int[] arrOne, int arrOneLength, int[] arrTwo, int arrTwoLength) {
        int[] result = new int[arrOneLength + arrTwoLength];

        if (arrOneLength >= 0) System.arraycopy(arrOne, 0, result, 0, arrOneLength);

        if (arrTwoLength >= 0) System.arraycopy(arrTwo, 0, result, arrOneLength, arrTwoLength);

        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        System.arraycopy(result, 0, arrOne, 0, result.length);
    }
}
