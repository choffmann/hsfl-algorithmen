package de.choffmann.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class ArraysTest {

    @Test
    public void testBinarySearchEmpty() {
        int[] array = new int[] {};
        Assert.assertFalse(Arrays.binarySearchRec(array, 0));
    }

    @Test
    public void testBinarySearchOddLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        Assert.assertFalse(Arrays.binarySearchRec(array, array[0] - 1));
        Assert.assertFalse(Arrays.binarySearchRec(array, array[array.length - 1] + 1));

        for (int i = 0; i < array.length; i++) {
            Assert.assertTrue(Arrays.binarySearchRec(array, array[i]));
        }
    }

    @Test
    public void testBinarySearchEvenLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        Assert.assertFalse(Arrays.binarySearchRec(array, array[0] - 1));
        Assert.assertFalse(Arrays.binarySearchRec(array, array[array.length - 1] + 1));

        for (int i = 0; i < array.length; i++) {
            Assert.assertTrue(Arrays.binarySearchRec(array, array[i]));
        }
    }

    @Test
    public void testSumEmpty() {
        int[] array = new int[] {};
        Assert.assertEquals(0, Arrays.sum(array));
    }

    @Test
    public void testSumOddLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        Assert.assertEquals(sum, Arrays.sum(array));
    }

    @Test
    public void testSumEvenLength() {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        Assert.assertEquals(sum, Arrays.sum(array));
    }

    @Test
    public void testContainsAllEmpty() {
        int[] array1 = {};
        int[] array2 = { 1, 2, 5, 8 };
        Assert.assertTrue(Arrays.containsAll(array1, array2));
    }

    @Test
    @Tag("Advanced")
    public void testContainsAllTrue() {
        int[] array1 = { 1, 5, 2 };
        int[] array2 = { 1, 2, 5, 8 };
        Assert.assertTrue(Arrays.containsAll(array1, array2));
    }

    @Test
    @Tag("Advanced")
    public void testContainsAllFalse() {
        int[] array1 = { 1, 6, 2 };
        int[] array2 = { 1, 2, 5, 8 };
        Assert.assertFalse(Arrays.containsAll(array1, array2));
    }

    @Test
    public void testContainsAll() {
        int[] array1 = { 1, 2, 6 };
        int[] array2 = { 1, 2, 5, 8 };
        Assert.assertFalse(Arrays.containsAll(array1, array2));
    }
}