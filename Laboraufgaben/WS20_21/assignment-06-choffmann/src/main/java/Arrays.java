
public class Arrays {

    public static Object[] expandArray(final Object[] a) {
        Object[] b = new Object[a.length * 2];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        return b;
    }

    public static void shiftElements(final Object[] a, final int index) {
        for (int i = a.length - 2; i >= index; i--) {
            a[i + 1] = a[i];
        }
    }
}