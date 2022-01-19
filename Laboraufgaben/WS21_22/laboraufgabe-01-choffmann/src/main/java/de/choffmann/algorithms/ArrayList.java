package de.choffmann.algorithms;

public class ArrayList<T> {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Object[] array;

    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    public ArrayList(int size) {
        this.array = new Object[size];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }

    public void add(int index, T e) {
        if (this.array.length == this.size) {
            this.array = Arrays.expandArray(this.array);
        }
        if (this.size > index) {
            Arrays.shiftElements(this.array, index);
        }
        this.array[index] = e;
        this.size++;
    }
}
