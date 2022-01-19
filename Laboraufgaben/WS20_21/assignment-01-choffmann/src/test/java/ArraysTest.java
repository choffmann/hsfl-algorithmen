import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void testExpandArray() {
        Object[] a = { "a", "b", "c", "d", "e" };
        Object[] b = Arrays.expandArray(a);

        assertEquals(2 * a.length, b.length);
        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i], b[i]);
        }
    }

    @Test
    public void testShiftElements() {
        Object[] a = { "a", "b", "c", "d", "e" };
        Object[] b = a.clone();
        int i = 2;
        Arrays.shiftElements(a, i);

        for (int j = 0; j < i; j++) {
            assertEquals(b[j], a[j]);
        }
        for (int j = i; j < a.length - 1; j++) {
            assertEquals(b[j], a[j + 1]);
        }
    }
}
