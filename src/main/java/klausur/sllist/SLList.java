package klausur.sllist;

public class SLList<T> {
    private Node<T> head;

    public SLList(Node<T> head) {
        this.head = head;
    }

    private Node<T> nodeAt(int index) {
        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T get(int index) {
        return nodeAt(index).value;
    }

    public int indexOf(T e) {
        int index = 0;
        boolean found = false;
        Node<T> current = this.head;
        while(current != null && !found) {
            if(current.value == e) {
                found = true;
            } else {
                current = current.next;
                index++;
            }
        }

        if(found) {
            return index;
        } else {
            return -1;
        }
    }
}
