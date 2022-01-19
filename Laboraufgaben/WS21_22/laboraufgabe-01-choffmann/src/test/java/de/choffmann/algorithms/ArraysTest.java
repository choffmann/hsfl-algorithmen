package de.choffmann.algorithms;

import org.junit.Assert;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void testExpandArray() {
        Object[] a = { "a", "b", "c", "d", "e" };
        Object[] b = Arrays.expandArray(a);

        Assert.assertEquals(2 * a.length, b.length);
        for (int i = 0; i < a.length; i++) {
            Assert.assertEquals(a[i], b[i]);
        }
    }

    @Test
    public void testShiftElements() {
        Object[] a = { "a", "b", "c", "d", "e" };
        Object[] b = a.clone();
        int i = 2;
        Arrays.shiftElements(a, i);

        for (int j = 0; j < i; j++) {
            Assert.assertEquals(b[j], a[j]);
        }
        for (int j = i; j < a.length - 1; j++) {
            Assert.assertEquals(b[j], a[j + 1]);
        }
    }
}
