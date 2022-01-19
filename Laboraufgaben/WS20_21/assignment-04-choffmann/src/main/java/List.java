
public interface List<T> {
    boolean isEmpty();

    T get(int index);

    void add(int index, T e);

    int size();

    T remove(int index);

    boolean contains(T value);
}
