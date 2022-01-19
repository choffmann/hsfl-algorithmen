package de.fuas.algorithms;

public class DLNode<T> {
    DLNode<T> prev;
    T value;
    DLNode<T> next;

    public DLNode(T value, DLNode<T> prev, DLNode<T> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }
}
