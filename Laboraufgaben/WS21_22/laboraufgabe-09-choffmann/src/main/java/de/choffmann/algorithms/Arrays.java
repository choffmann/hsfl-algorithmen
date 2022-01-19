package de.choffmann.algorithms;

public class Arrays {

    public static boolean subsetsum(final int[] array, final int sum) {
        Boolean[] memo = new Boolean[array.length];
        return subsetsum(memo, array, sum, 0);
    }

    private static boolean subsetsum(final Boolean[] memo, final int[] array, final int sum, final int index) {
        if (sum == 0) {
            memo[index] = true;
            return memo[index];
        } else if (index >= array.length || sum < 0) {
            memo[index] = false;
            return memo[index];
        } else {
            if (memo[index] == null) {
                return subsetsum(memo, array, sum - array[index], index + 1) || subsetsum(memo, array, sum, index + 1);
            } else {
                return memo[index];
            }
        }
    }
}
