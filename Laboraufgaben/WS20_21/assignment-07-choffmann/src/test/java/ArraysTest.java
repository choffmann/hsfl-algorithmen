import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void testBinarySearchEmpty() {
        int[] array = new int[] {};
        assertFalse(Arrays.binarySearchRec(array, 0));
    }

    @Test
    public void testBinarySearchOddLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        assertFalse(Arrays.binarySearchRec(array, array[0] - 1));
        assertFalse(Arrays.binarySearchRec(array, array[array.length - 1] + 1));

        for (int i = 0; i < array.length; i++) {
            assertTrue(Arrays.binarySearchRec(array, array[i]));
        }
    }

    @Test
    public void testBinarySearchEvenLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        assertFalse(Arrays.binarySearchRec(array, array[0] - 1));
        assertFalse(Arrays.binarySearchRec(array, array[array.length - 1] + 1));

        for (int i = 0; i < array.length; i++) {
            assertTrue(Arrays.binarySearchRec(array, array[i]));
        }
    }

    @Test
    public void testSumEmpty() {
        int[] array = new int[] {};
        assertEquals(0, Arrays.sum(array));
    }

    @Test
    public void testSumOddLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        assertEquals(sum, Arrays.sum(array));
    }

    @Test
    public void testSumEvenLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        assertEquals(sum, Arrays.sum(array));
    }

    @Test
    public void testMagicEmpty() {
        int[] array = new int[] {};
        assertNull(Arrays.magic(array));
    }

    @Test
    public void testMagicOddLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        assertNull(Arrays.magic(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            assertEquals((Integer) i, Arrays.magic(array));
            array[i] = i - 1;
        }
    }

    @Test
    public void testMagicEvenLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        assertNull(Arrays.magic(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            assertEquals((Integer) i, Arrays.magic(array));
            array[i] = i - 1;
        }
    }
}