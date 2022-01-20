package klausur.stack;

public class Node<T> {
    T value;
    Node<T> prev;

    public Node(T value, Node<T> prev) {
        this.value = value;
        this.prev = prev;
    }
}
