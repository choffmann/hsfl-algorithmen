import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DLListTest {

    @Test
    public void testIsEmpty() {
        DLList<String> list = new DLList<>();

        assertTrue(list.isEmpty());
        list.add(0, "a");

        assertFalse(list.isEmpty());
    }

    @Test
    public void testSize() {
        DLList<String> list = new DLList<>();

        assertEquals(0, list.size());
        list.add(0, "a");

        assertEquals(1, list.size());
    }

    @Test
    public void testAddAtTheEnd() {
        DLList<String> list = new DLList<>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");

        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
        assertEquals("d", list.get(3));
    }

    @Test
    public void testAddAtTheBeginning() {
        DLList<String> list = new DLList<>();
        list.add(0, "b");
        list.add(0, "a");

        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddBetween() {
        DLList<String> list = new DLList<>();
        list.add(0, "a");
        list.add(1, "c");
        list.add(1, "b");

        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("c", list.get(2));
    }
}
