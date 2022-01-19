
public class SLList<T> implements List<T> {

    private Node<T> head;
    private int listSize;

    public SLList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    private Node<T> nodeAt(int index) {
        Node<T> current = this.head;
        if (current == null || index >= listSize) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T get(int index) {
        Node<T> node = nodeAt(index);
        return node.value;
    }

    public void add(int index, T e) {
        if (index == 0) {
            this.head = new Node<T>(e, this.head);
        } else {
            Node<T> pred = nodeAt(index - 1);
            pred.next = new Node<T>(e, pred.next);
        }
        listSize++;
    }

    // size ohne Attribute
//    public int size() {
//        int count = 0;
//        Node<T> current = this.head;
//        while(current != null) {
//            count++;
//            current = current.next;
//        }
//        return count;
//    }

    // size mit Attribute
    public int size() {
        return listSize;
    }

    public T remove(int index) {
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
}
