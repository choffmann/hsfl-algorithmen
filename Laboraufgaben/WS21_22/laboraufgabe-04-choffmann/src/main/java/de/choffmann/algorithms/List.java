package de.choffmann.algorithms;

public interface List<T> {
    boolean isEmpty();

    int size();

    T get(int index);

    void add(int index, T value);

    T remove(int index);
}
