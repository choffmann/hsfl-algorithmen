package de.fuas.algorithms;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Measure {

    static final int MEASURE_SIZE = 100000;

    static <T> void measure(final Supplier<T> supplier) {
        long startTime = System.nanoTime();
        supplier.get();
        long endTime = System.nanoTime();
        long difference = endTime - startTime;
        System.out.println(" Ausfuehrung dauerte " + TimeUnit.NANOSECONDS.toMillis(difference) + "ms");
    }

    public static void main(final String[] args) {
        ArrayList<String> arrayListContains = new ArrayList<>(MEASURE_SIZE);
        // Fügt am Ende der Liste den Wert "b" hinzu
        arrayListContains.add(MEASURE_SIZE - 1, "b");

        SLList<String> slListContains = new SLList<>();
        // Fügt am Ende der Liste den Wert "b" hinzu
        for (int i = 0; i < MEASURE_SIZE; i++) {
            if (i == MEASURE_SIZE - 1) {
                slListContains.add(i, "b");
            }
            slListContains.add(i, null);
        }

        System.out.println("Objektmethode contains für SLList");
        // Hier wird die Laufzeit des Aufrufs sllist.contains("b") gemessen
        measure(() -> slListContains.contains("b")); // 2ms

        System.out.println("Objektmethode contains für ArrayList");
        // Hier wird die Laufzeit des Aufrufs arraylist.contains("b") gemessen
        measure(() -> arrayListContains.contains("b")); // 0ms

        System.out.println("Statische Methode contains für SLList");
        // Hier wird die Laufzeit des Aufrufs Lists.contains(sllist, "b") gemessen
        measure(() -> Lists.contains(slListContains, "b")); // 7728ms

        System.out.println("Statische Methode contains für ArrayList");
        // Hier wird die Laufzeit des Aufrufs Lists.contains(arraylist, "b") gemessen
        measure(() -> Lists.contains(arrayListContains, "b")); // 0ms

        ArrayList<String> arrayListAdd = new ArrayList<>();
        SLList<String> slListAdd = new SLList<>();

        System.out.println("Statische Methode add für SLList");
        measure(() -> Lists.add(slListAdd, "b")); // 4ms
        System.out.println("Statische Methode add für ArrayList");
        measure(() -> Lists.add(arrayListAdd, "b")); // 18258ms

    }
}
