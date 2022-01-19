package de.fuas.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;

@DisplayNameGeneration(value = DisplayNameGeneratorMethodTag.class)
public class BinTreeTest {

    private BinTree emptyTree() {
        return new BinTree(null);
    }

    private BinTree tree1() {
        BinTreeNode four = new BinTreeNode(null, 4, null);
        BinTreeNode three = new BinTreeNode(null, 3, null);
        BinTreeNode two = new BinTreeNode(null, 2, null);
        BinTreeNode one = new BinTreeNode(three, 1, four);
        BinTreeNode root = new BinTreeNode(one, 0, two);
        return new BinTree(root);
    }

    private BinTree tree2() {
        BinTreeNode four = new BinTreeNode(null, 4, null);
        BinTreeNode three = new BinTreeNode(four, 3, null);
        BinTreeNode two = new BinTreeNode(three, 2, null);
        BinTreeNode one = new BinTreeNode(two, 1, null);
        BinTreeNode root = new BinTreeNode(one, 0, null);
        return new BinTree(root);
    }

    @Test
    public void testCountNodes() {
        Assert.assertEquals(0, emptyTree().countNodes());
        Assert.assertEquals(5, tree1().countNodes());
        Assert.assertEquals(5, tree2().countNodes());
    }

    @Test
    public void testSum() {
        Assert.assertEquals(0, emptyTree().sum());
        Assert.assertEquals(10, tree1().sum());
        Assert.assertEquals(10, tree2().sum());
    }

    @Test
    public void testEntriesEmpty() {
        List<Integer> list = emptyTree().entries();
        Assert.assertEquals(0, list.size());
    }

    private void testEntries(final Integer[] expected, final BinTree tree) {
        List<Integer> list = tree.entries();
        for (int i = 0; i < expected.length; i++) {
            Integer actual = list.get(i);
            Assert.assertEquals("Entry at position " + i + " should be " + expected[i] + " but is " + actual,
                    expected[i], actual);
        }
    }

    @Test
    @Tag("Advanced")
    public void testEntriesTree1() {
        Integer[] expected = { 3, 1, 4, 0, 2 };
        testEntries(expected, tree1());
    }

    @Test
    @Tag("Advanced")
    public void testEntriesTree2() {
        Integer[] expected = { 4, 3, 2, 1, 0 };
        testEntries(expected, tree2());
    }
}
