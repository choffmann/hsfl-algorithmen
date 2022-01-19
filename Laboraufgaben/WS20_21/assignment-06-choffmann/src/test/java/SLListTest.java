import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SLListTest {

    @Test
    public void testIsEmpty() {
        SLList<String> list = new SLList<String>();

        assertTrue(list.isEmpty());
        list.add(0, "a");

        assertFalse(list.isEmpty());
    }

    @Test
    public void testSize() {
        SLList<String> list = new SLList<String>();

        assertEquals(0, list.size());
        list.add(0, "a");

        assertEquals(1, list.size());
    }

    @Test
    public void testAddGet() {
        SLList<String> list = new SLList<String>();
        list.add(0, "a");
        list.add(0, "b");

        assertEquals("a", list.get(1));
    }

    @Test
    public void testNull() {
        SLList<String> list = new SLList<String>();
        list.add(0, null);

        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
        assertEquals(null, list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithInvalidIndex() {
        SLList<String> list = new SLList<String>();
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddWithInvalidIndex() {
        SLList<String> list = new SLList<String>();
        list.add(1, "a");
    }

    @Test
    public void testRemove() {
        SLList<String> list = new SLList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");

        assertEquals("a", list.remove(0));
        assertEquals("b", list.get(0));
        assertEquals("c", list.remove(1));
        assertEquals(1, list.size());
    }

    @Test
    public void testContains() {
        SLList<String> list = new SLList<>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "b");

        assertTrue(list.contains(new String("a")));
        assertTrue(list.contains(null));
        assertTrue(list.contains(new String("b")));
        assertFalse(list.contains(new String("c")));
    }
}