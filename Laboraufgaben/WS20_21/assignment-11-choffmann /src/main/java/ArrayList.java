public class ArrayList<T> implements List<T> {

    public static final int DEFAULT_SIZE = 10;

    private int sizeElement;
    private Object[] a;

    public ArrayList(final int size) {
        a = new Object[size];
    }

    public ArrayList() {
        this(DEFAULT_SIZE);
    }

    public boolean isEmpty() {
        return sizeElement == 0;
    }

    public int size() {
        return sizeElement;
    }

    @SuppressWarnings("unchecked")
    public T get(final int index) {
        return (T) a[index];
    }

    public void add(final int index, final T e) {
        if (a.length == sizeElement) {
            a = Arrays.expandArray(a);
        }
        if (a[index] != null) {
            Arrays.shiftElements(a, index);
        }
        a[index] = e;
        sizeElement++;
    }

    @Override
    public T remove(final int index) {
        T value = get(index);
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = null;
        sizeElement--;
        return value;
    }

    @Override
    public boolean contains(final T value) {
        return contains(value, 0);
    }

    private boolean contains(final T value, final int index) {
        if (index >= a.length - 1) {
            return false;
        } else if (value == null && value == get(index)) {
            return true;
        } else if (value != null && value.equals(get(index))) {
            return true;
        } else {
            return contains(value, index + 1);
        }
    }
}