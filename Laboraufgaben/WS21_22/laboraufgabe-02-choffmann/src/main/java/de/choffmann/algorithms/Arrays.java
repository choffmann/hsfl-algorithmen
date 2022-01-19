package de.choffmann.algorithms;

public class Arrays {

    public static Object[] expandArray(final Object[] array) {
        Object[] expandArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            expandArray[i] = array[i];
        }
        return expandArray;
    }

    public static void shiftElements(final Object[] array, final int index) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = null;
    }
}
