package de.choffmann.algorithms;

public class SLList<T> implements List<T> {
    private Node<T> first;
    private int size;

    public SLList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    private Node<T> nodeAt(final int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            Node<T> current = this.first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
    }

    public T get(final int index) {
        return nodeAt(index).value;
    }

    public void add(final int index, final T e) {
        if (index == 0) {
            this.first = new Node<T>(e, this.first);
        } else {
            Node<T> pred = nodeAt(index - 1);
            pred.next = new Node<T>(e, pred.next);
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public T remove(final int index) {
        T value = null;
        if (index == 0) {
            value = this.first.value;
            this.first = first.next;
        }
        if (index > 0 && index < this.size - 1) {
            Node<T> pred = nodeAt(index - 1);
            value = pred.next.value;
            pred.next = pred.next.next;
        }
        if (index + 1 == this.size) {
            Node<T> pred = nodeAt(index - 1);
            value = pred.next.value;
            pred.next = null;
        }
        this.size--;
        return value;
    }

    public boolean contains(final T value) {
        return contains(value, this.first);
    }

    private boolean contains(final T value, final Node<T> current) {
        if (current == null) {
            return false;
        } else if (value == null && current.value == null || value != null && value.equals(current.value)) {
            return true;
        } else {
            return contains(value, current.next);
        }
    }
}
