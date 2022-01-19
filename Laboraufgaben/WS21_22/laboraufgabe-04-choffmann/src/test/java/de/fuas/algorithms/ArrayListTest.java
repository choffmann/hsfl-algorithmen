package de.fuas.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class ArrayListTest {

    @Test
    public void testIsEmpty() {
        ArrayList<String> list = new ArrayList<String>();

        Assert.assertTrue(list.isEmpty());

        list.add(0, "a");

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testSize() {
        ArrayList<String> list = new ArrayList<String>();

        Assert.assertEquals(0, list.size());

        list.add(0, "a");

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testAddGet() {
        ArrayList<String> list = new ArrayList<String>(1);
        list.add(0, "a");
        list.add(0, "b");
        list.add(2, "c");
        list.add(2, "d");

        Assert.assertEquals("b", list.get(0));
        Assert.assertEquals("a", list.get(1));
        Assert.assertEquals("d", list.get(2));
        Assert.assertEquals("c", list.get(3));
    }

    @Test
    public void testAddExpand() {
        ArrayList<String> list = new ArrayList<String>(2);
        list.add(0, "a");
        list.add(0, "b");
        list.add(0, "c");

        Assert.assertEquals("c", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("a", list.get(2));
    }

    @Test
    public void testAddNull() {
        ArrayList<String> list = new ArrayList<String>(1);
        list.add(0, null);
        list.add(1, "a");
        list.add(0, null);

        Assert.assertEquals(null, list.get(0));
        Assert.assertEquals(null, list.get(1));
        Assert.assertEquals("a", list.get(2));
    }

    @Test
    public void testNull() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, null);

        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(null, list.get(0));
    }

    @Test
    public void testGeneric() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 23);

        Assert.assertEquals(23, (int) list.get(0));
    }

    @Test
    public void testRemove() {
        ArrayList<String> list = new ArrayList<String>(2);
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");

        Assert.assertEquals("b", list.remove(1));
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("c", list.get(1));
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testContains() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");

        Assert.assertTrue(list.contains(new String("a")));
        Assert.assertTrue(list.contains(new String("b")));
        Assert.assertTrue(list.contains(new String("c")));
        Assert.assertFalse(list.contains(new String("d")));
    }

    @Test
    public void testContainsListWithNull() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "b");

        Assert.assertFalse(list.contains(new String("c")));
    }

    @Test
    @Tag("Advanced")
    public void testContainsSearchNull() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "b");

        Assert.assertTrue(list.contains(null));

        list.remove(1);

        Assert.assertFalse(list.contains(null));
    }
}
