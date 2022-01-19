
public class SLList<T> implements List<T> {

    private Node<T> head;
    private int listSize;

    public SLList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    private Node<T> nodeAt(final int index) {
        return nodeAt(0, index, this.head);
    }

    private Node<T> nodeAt(final int index, final int maxIndex, final Node<T> current) {
        if (current == null || index >= listSize) {
            throw new IndexOutOfBoundsException();
        }
        if (index == maxIndex) {
            return current;
        } else {
            return nodeAt(index + 1, maxIndex, current.next);
        }
    }

    public T get(final int index) {
        Node<T> node = nodeAt(index);
        return node.value;
    }

    public void add(final int index, final T e) {
        if (index == 0) {
            this.head = new Node<T>(e, this.head);
        } else {
            Node<T> pred = nodeAt(index - 1);
            pred.next = new Node<T>(e, pred.next);
        }
        listSize++;
    }

    public int size() {
        return listSize;
    }

    public T remove(final int index) {
        Node<T> current = nodeAt(index);
        T value = current.value;

        if (index == 0) {
            this.head = current.next;
        }
        if (index > 0 && index + 1 < size()) {
            current = current.next;
        }

        listSize--;
        return value;
    }

    @Override
    public boolean contains(final T value) {
        return contains(value, this.head);
    }

    private boolean contains(final T value, final Node<T> current) {
        if (current == null) {
            return false;
        } else if (value == null && value == current.value) {
            return true;
        } else if (value != null && value.equals(current.value)) {
            return true;
        } else {
            return contains(value, current.next);
        }
    }
}
