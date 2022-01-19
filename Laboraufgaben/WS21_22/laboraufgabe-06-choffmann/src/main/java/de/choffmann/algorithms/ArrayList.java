package de.choffmann.algorithms;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Object[] array;

    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    public ArrayList(final int size) {
        this.array = new Object[size];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    @SuppressWarnings("unchecked")
    public T get(final int index) {
        return (T) array[index];
    }

    public void add(final int index, final T e) {
        if (this.array.length == this.size) {
            this.array = Arrays.expandArray(this.array);
        }
        if (this.size > index) {
            Arrays.shiftElements(this.array, index);
        }
        this.array[index] = e;
        this.size++;
    }

    @Override
    public T remove(final int index) {
        T value = get(index);
        for (int i = index; i <= index; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        this.size--;
        return value;
    }

    public boolean contains(final T value) {
        return contains(value, 0);
    }

    private boolean contains(final T value, final int index) {
        if (index >= this.size()) {
            return false;
        } else if (value == get(index) || value != null && value.equals(get(index))) {
            return true;
        } else {
            return contains(value, index + 1);
        }
    }
}
