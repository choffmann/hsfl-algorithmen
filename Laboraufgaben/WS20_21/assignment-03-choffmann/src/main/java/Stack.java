
public class Stack<T> {
    private Node<T> head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
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
        Node<T> current = this.head;
        while (current != null) {
            if (current.value.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
