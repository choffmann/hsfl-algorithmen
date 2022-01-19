
public class DLList<T> {

    private DLNode<T> head;
    private DLNode<T> last;

    private int size;

    public DLList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private DLNode<T> nodeAt(int index) {
        DLNode<T> current = null;
        if (size / 2 <= index) {
            current = this.head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = this.last;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    public T get(int index) {
        return nodeAt(index).value;
    }

    public void add(int index, T e) {
        if (index == 0 && size == 0) {
            DLNode<T> node = new DLNode<T>(e, null, null);
            this.head = node;
            this.last = node;
        }
        if (index == 0 && size > 0) {
            this.head = new DLNode<T>(e, null, this.head);
            DLNode<T> node = this.head.next;
            node.prev = this.head;
        }
        if (index > 0 && index == size) {
            this.last = new DLNode<T>(e, this.last, null);
            this.last.prev.next = this.last;
        }
        if (index > 0 && index < size) {
            DLNode<T> current = nodeAt(index);
            DLNode<T> pred = current.prev;

            pred.next = new DLNode<T>(e, pred, current);
            current.prev = pred.next;
        }
        size++;
    }
}
