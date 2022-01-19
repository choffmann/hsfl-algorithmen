package de.choffmann.algorithms;

public class Lists {
    static <T> boolean contains(final List<T> list, final T value) {
        boolean found = false;
        for (int i = 0; i < list.size() && !found; i++) {
            if (value == null && list.get(i) == null || value != null && value.equals(list.get(i))) {
                found = true;
            }
        }
        return found;
    }

    static <T> boolean add(final List<T> list, final T value) {
        for (int i = 0; i < Measure.MEASURE_SIZE; i++) {
            list.add(0, value);
        }
        return true;
    }
}
