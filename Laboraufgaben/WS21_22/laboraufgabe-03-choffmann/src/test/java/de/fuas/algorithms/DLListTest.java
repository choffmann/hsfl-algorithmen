package de.fuas.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class DLListTest {

    @Test
    public void testIsEmpty() {
        DLList<String> list = new DLList<>();

        Assert.assertTrue(list.isEmpty());
        list.add(0, "a");

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testSize() {
        DLList<String> list = new DLList<>();

        Assert.assertEquals(0, list.size());
        list.add(0, "a");

        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testAddAtTheEnd() {
        DLList<String> list = new DLList<>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");
        list.add(3, "d");

        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c", list.get(2));
        Assert.assertEquals("d", list.get(3));
    }

    @Test
    public void testAddAtTheBeginning() {
        DLList<String> list = new DLList<>();
        list.add(0, "b");
        list.add(0, "a");

        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
    }

    @Test
    @Tag("Advanced")
    public void testAddBetween() {
        DLList<String> list = new DLList<>();
        list.add(0, "a");
        list.add(1, "c");
        list.add(1, "b");

        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));
        Assert.assertEquals("c", list.get(2));
    }
}
