package de.fuas.algorithms;

public class DLList<T> implements List<T> {
    private DLNode<T> first;
    private DLNode<T> last;
    private int size;

    public DLList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {
        return nodeAt(index).value;
    }

    @Override
    public void add(int index, T value) {
        if (index == 0 && this.size == 0) {
            DLNode<T> node = new DLNode<T>(value, null, null);
            this.first = node;
            this.last = node;
        }
        if (index == 0 && this.size > 0) {
            DLNode<T> node = new DLNode<T>(value, null, this.first);
            this.first = node;
            node.next.prev = this.first;
        }
        if (index > 0 && index == this.size) {
            DLNode<T> node = new DLNode<T>(value, this.last, null);
            this.last = node;
            this.last.prev.next = node;
        }
        if (index > 0 && index < this.size) {
            DLNode<T> current = nodeAt(index);
            DLNode<T> pred = current.prev;
            DLNode<T> node = new DLNode<T>(value, pred, current);

            pred.next = node;
            current.prev = node;
        }
        this.size++;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    private DLNode<T> nodeAt(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            DLNode<T> current = null;
            if (size / 2 <= index) {
                current = this.first;
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
    }
}
