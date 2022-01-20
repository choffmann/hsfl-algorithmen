package de.choffmann.algorithms;

public interface Set<T> {
    boolean isEmpty();

    int size();

    boolean contains(Object object);

    boolean add(T value);
}
