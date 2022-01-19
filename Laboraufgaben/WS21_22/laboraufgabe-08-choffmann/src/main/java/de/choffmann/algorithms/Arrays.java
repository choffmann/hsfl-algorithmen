package de.choffmann.algorithms;

public class Arrays {


    static boolean binarySearchRec(final int[] array, final int value) {
        return binarySearchRec(array, value, 0, array.length - 1);
    }

    static boolean binarySearchRec(final int[] array, final int value, final int start, final int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = array[mid];
            if (value < midValue) {
                return binarySearchRec(array, value, start, mid - 1);
            } else if (value > midValue) {
                return binarySearchRec(array, value, mid + 1, end);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    static int sum(final int[] array) {
        return sum(array, 0, array.length - 1);
    }

    static int sum(final int[] array, final int start, final int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            return array[mid] + sum(array, start, mid - 1) + sum(array, mid + 1, end);
        } else {
            return 0;
        }
    }

    static boolean containsAll(final int[] array1, final int[] array2) {
        boolean contains = true;
        for (int i = 0; i < array1.length && contains; i++) {
            if (!binarySearchRec(array2, array1[i])) {
                contains = false;
            }
        }
        return contains;
    }
}
