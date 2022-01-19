
public class ArrayList<T> {

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
}