package de.choffmann.algorithms;

public class Stack<T> {
    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void push(T e) {
        this.head = new Node<T>(e, this.head);
    }

    public T pop() {
        T value = this.head.value;
        this.head = this.head.next;
        return value;
    }

    public T peek() {
        return this.head.value;
    }

    public boolean find(T e) {
        boolean found = false;
        Node<T> current = this.head;
        while (current != null && !found) {
            if (current.value.equals(e)) {
                found = true;
            }
            current = current.next;
        }
        return found;
    }
}
