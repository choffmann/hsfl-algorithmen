
public class DLNode<T> {
    T value;
    DLNode<T> prev;
    DLNode<T> next;

    public DLNode(T value, DLNode<T> prev, DLNode<T> next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
