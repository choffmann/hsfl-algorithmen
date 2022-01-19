import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayListTest {

    @Test
    public void testIsEmpty() {
        ArrayList<String> list = new ArrayList<String>();

        assertTrue(list.isEmpty());
        list.add(0, "a");

        assertFalse(list.isEmpty());
    }

    @Test
    public void testSize() {
        ArrayList<String> list = new ArrayList<String>();

        assertEquals(0, list.size());
        list.add(0, "a");

        assertEquals(1, list.size());
    }

    @Test
    public void testAddGet() {
        ArrayList<String> list = new ArrayList<String>(1);
        list.add(0, "a");
        list.add(0, "b");
        assertEquals("b", list.get(0));
        assertEquals("a", list.get(1));
    }

    @Test
    public void testNull() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, null);

        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(null, list.get(0));
    }

    @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, "b");

        assertEquals("a", list.remove(0));
        assertEquals("b", list.get(0));
        assertEquals(1, list.size());
    }

    @Test
    public void testContains() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "b");

        assertTrue(list.contains(new String("a")));
        assertTrue(list.contains(null));
        assertTrue(list.contains(new String("b")));
        assertFalse(list.contains(new String("c")));
    }
}