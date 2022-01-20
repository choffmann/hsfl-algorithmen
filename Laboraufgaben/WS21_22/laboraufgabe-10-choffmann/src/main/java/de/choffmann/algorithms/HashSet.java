package de.choffmann.algorithms;

import java.util.LinkedList;

public class HashSet<T> implements Set<T> {
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private static final float MAX_LOAD_FACTOR = 0.75f;

    private LinkedList<T>[] table;
    private int size;

    public HashSet() {
        @SuppressWarnings("unchecked")
        LinkedList<T>[] newTable = (LinkedList<T>[]) new LinkedList[DEFAULT_INITIAL_CAPACITY];
        this.table = newTable;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    private float loadFactor() {
        return this.size() / (float) this.table.length;
    }

    private static int index(Object object, int capacity) {
        return object == null ? 0 : Math.floorMod(object.hashCode(), capacity);
    }

    private void expandTable() {
        int newCapacity = 2 * this.table.length;

        @SuppressWarnings("unchecked")
        LinkedList<T>[] newTable = (LinkedList<T>[]) new LinkedList[newCapacity];

        for (LinkedList<T> list : this.table) {
            if (list != null) {
                for (T entry : list) {
                    int index = index(entry, newCapacity);
                    if (newTable[index] == null) {
                        newTable[index] = new LinkedList<T>();
                    }
                    newTable[index].add(entry);
                }
            }
        }

        this.table = newTable;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public boolean add(T value) {
        return false;
    }
}