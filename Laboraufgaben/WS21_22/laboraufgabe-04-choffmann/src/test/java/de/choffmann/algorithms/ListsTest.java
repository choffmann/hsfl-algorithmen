package de.choffmann.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class ListsTest {

    @Test
    public void testContains() {
        List<String> list = new SLList<String>();
        list.add(0, "a");
        list.add(1, "b");
        list.add(2, "c");

        Assert.assertTrue(Lists.contains(list, new String("a")));
        Assert.assertTrue(Lists.contains(list, new String("b")));
        Assert.assertTrue(Lists.contains(list, new String("c")));
        Assert.assertFalse(Lists.contains(list, new String("d")));
    }

    @Test
    public void testContainsListWithNull() {
        List<String> list = new SLList<String>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "b");

        Assert.assertFalse(Lists.contains(list, new String("c")));
    }

    @Test
    @Tag("Advanced")
    public void testContainsSearchNull() {
        List<String> list = new SLList<String>();
        list.add(0, "a");
        list.add(1, null);
        list.add(2, "b");

        Assert.assertTrue(Lists.contains(list, null));

        list.remove(1);

        Assert.assertFalse(Lists.contains(list, null));
    }
}