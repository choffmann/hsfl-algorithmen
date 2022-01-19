
public class Node<T> {
    T value;
    Node<T> next;

    public Node(final T value, final Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
