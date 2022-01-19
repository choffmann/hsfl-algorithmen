
public class Lists {
    static <T> boolean contains(final List<T> list, final T value) {
        boolean found = false;
        for (int i = 0; i < list.size() && !found; i++) {
            if (value == null && value == list.get(i)) {
                found = true;
            }
            if (value != null && value.equals(list.get(i))) {
                found = true;
            }

        }
        return found;
    }

    static <T> boolean add(final List<T> list, final T value) {
        for (int i = 0; i < Main.MEASURE_SIZE; i++) {
            list.add(i, value);
        }
        return true;
    }
}