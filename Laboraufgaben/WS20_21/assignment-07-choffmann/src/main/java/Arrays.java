
public class Arrays {

    static boolean binarySearchRec(final int[] array, final int x) {
        return binarySearchRec(array, x, 0, array.length - 1);
    }

    private static boolean binarySearchRec(final int[] array, final int x, final int start, final int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = array[mid];

            if (x < midValue) {
                return binarySearchRec(array, x, start, mid - 1);
            } else if (x > midValue) {
                return binarySearchRec(array, x, mid + 1, end);
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

    private static int sum(final int[] array, final int start, final int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (start + 1 == end) {
                return array[start] + array[end];
            } else {
                return array[mid] + sum(array, start, mid - 1) + sum(array, mid + 1, end);
            }
        } else {
            return 0;
        }
    }

    static Integer magic(final int[] array) {
        return magic(array, 0, array.length - 1);
    }

    private static Integer magic(final int[] array, final int start, final int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = array[mid];

            if (midValue > mid) {
                return magic(array, start, mid - 1);
            } else if (midValue < mid) {
                return magic(array, mid + 1, end);
            } else {
                return midValue;
            }
        } else {
            return null;
        }
    }
}
