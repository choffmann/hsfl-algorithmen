
public class ArrayList<T> implements List<T> {

    public static final int DEFAULT_SIZE = 10;

    private int sizeElement;
    private Object[] a;

    public ArrayList(int size) {
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
    public T get(int index) {
        return (T) a[index];
    }

    public void add(int index, T e) {
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
    public T remove(int index) {
        T value = get(index);
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = null;
        sizeElement--;
        return value;
    }
}