package de.choffmann.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    void testZero() {
        int[] array = { 2, 1, 5, 4 };
        Assert.assertTrue("Das Array " + java.util.Arrays.toString(array) + " enthält 0 als Summe",
                Arrays.subsetsum(array, 0));
    }

    @Test
    void testSuccess() {
        int[] array = { 2, 1, 5, 4 };
        Assert.assertTrue("Das Array " + java.util.Arrays.toString(array) + " enthält 7 als Summe",
                Arrays.subsetsum(array, 7));
    }

    @Test
    void testFailure() {
        int[] array = { 2, 5, 4 };
        Assert.assertFalse("Das Array " + java.util.Arrays.toString(array) + " enthält nicht 3 als Summe",
                Arrays.subsetsum(array, 3));
    }
}
