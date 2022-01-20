package klausur.stack;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T v) {
        this.top = new Node<T>(v, this.top);
    }

    public T pop() {
        T value = this.top.value;
        this.top = this.top.prev;
        return value;
    }

    public T remove() {
        T value = null;
        Node<T> current = this.top;
        while(current != null) {
           if(current.prev.prev == null) {
                value = current.prev.value;
                current.prev = null;
           }
            current = current.prev;
        }
        return value;
    }
}
