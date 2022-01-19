import org.junit.Assert;
import org.junit.Test;

public class ArraysTest {

    private static boolean isSorted(final int[] array, final int start, final int end) {
        boolean sorted = true;
        for (int i = start; i < end && sorted; i++) {
            sorted = sorted && array[i] < array[i + 1];
        }
        return sorted;
    }

    @Test
    public void testFuse() {
        int[] source = { 1, 3, 4, 2, 5, 6 };
        Assert.assertTrue(isSorted(source, 0, 2));
        Assert.assertTrue(isSorted(source, 3, 5));

        int[] result = Arrays.fuse(source, 0, 2, 3, 5);
        Assert.assertTrue(isSorted(result, 0, 5));
    }

    @Test
    public void testFuseFirstHalfFirst() {
        int[] source = { 1, 2, 3, 4, 5, 6 };
        Assert.assertTrue(isSorted(source, 0, 2));
        Assert.assertTrue(isSorted(source, 3, 5));

        int[] result = Arrays.fuse(source, 0, 2, 3, 5);
        Assert.assertTrue(isSorted(result, 0, 5));
    }

    @Test
    public void testFuseSecondHalfFirst() {
        int[] source = { 4, 5, 6, 1, 2, 3 };
        Assert.assertTrue(isSorted(source, 0, 2));
        Assert.assertTrue(isSorted(source, 3, 5));

        int[] result = Arrays.fuse(source, 0, 2, 3, 5);
        Assert.assertTrue(isSorted(result, 0, 5));
    }

    @Test
    public void testCopy() {
        int[] source = { 1, 2, 3 };
        int[] target = new int[5];

        Arrays.copy(source, target, 2);
        for (int i = 0; i < source.length; i++) {
            Assert.assertEquals(source[i], target[i + 2]);
        }
    }

    @Test
    public void testSortEven() {
        int[] array = { 6, 5, 1, 2, 3, 4 };
        Arrays.sort(array);

        Assert.assertTrue(isSorted(array, 0, array.length - 1));
    }

    @Test
    public void testSortOdd() {
        int[] array = { 5, 1, 2, 3, 4 };
        Arrays.sort(array);

        Assert.assertTrue(isSorted(array, 0, array.length - 1));
    }
}
