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

    private Node<T> nodeAt(int index) {
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

    public T get(int index) {
        return nodeAt(index).value;
    }

    public void add(int index, T e) {
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

    public int naiveSize() {
        int count = 0;
        Node<T> current = this.first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public T remove(int index) {
        //Node<T> current = nodeAt(index);
        //T value = current.value;

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
}
