
public class Arrays {
    static int[] fuse(final int[] source, final int start1, final int end1, final int start2, final int end2) {
        int[] temp = new int[(end1 - start1 + 1) + (end2 - start2 + 1)];

        int i1 = start1;
        int i2 = start2;
        int i = 0;
        while (i1 <= end1 || i2 <= end2) {
            if (i1 > end1) {
                temp[i] = source[i2];
                i2++;
            } else if (i2 > end2) {
                temp[i] = source[i1];
                i1++;
            } else if (source[i1] <= source[i2] && i1 <= end1) {
                temp[i] = source[i1];
                i1++;
            } else {
                temp[i] = source[i2];
                i2++;
            }
            i++;
        }
        return temp;
    }

    static void copy(final int[] source, final int[] target, final int offset) {
        for (int i = 0; i < source.length && offset + i < target.length; i++) {
            target[offset + i] = source[i];
        }
    }

    static void sort(final int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(final int[] array, final int start, final int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (start + 1 < end) {
                sort(array, start, mid);
                sort(array, mid + 1, end);
            }
            copy(fuse(array, start, mid, mid + 1, end), array, start);
        }

    }
}