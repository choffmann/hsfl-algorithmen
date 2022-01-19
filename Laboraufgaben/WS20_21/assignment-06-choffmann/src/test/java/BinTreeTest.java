import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class BinTreeTest {

    private BinTree<Integer> emptyTree() {
        return new BinTree<>(null);
    }

    private BinTree<Integer> tree1() {
        BinTreeNode<Integer> four = new BinTreeNode<>(null, 4, null);
        BinTreeNode<Integer> three = new BinTreeNode<>(null, 3, null);
        BinTreeNode<Integer> two = new BinTreeNode<>(null, 2, null);
        BinTreeNode<Integer> one = new BinTreeNode<>(three, 1, four);
        BinTreeNode<Integer> root = new BinTreeNode<>(one, 0, two);
        return new BinTree<>(root);
    }

    private BinTree<Integer> tree2() {
        BinTreeNode<Integer> four = new BinTreeNode<>(null, 4, null);
        BinTreeNode<Integer> three = new BinTreeNode<>(four, 3, null);
        BinTreeNode<Integer> two = new BinTreeNode<>(three, 2, null);
        BinTreeNode<Integer> one = new BinTreeNode<>(two, 1, null);
        BinTreeNode<Integer> root = new BinTreeNode<>(one, 0, null);
        return new BinTree<>(root);
    }

    @Test
    public void testNodes() {
        assertEquals(0, emptyTree().nodes());
        assertEquals(5, tree1().nodes());
        assertEquals(5, tree2().nodes());
    }

    @Test
    public void testHeight() {
        assertEquals(0, emptyTree().height());
        assertEquals(3, tree1().height());
        assertEquals(5, tree2().height());
    }

    @Test
    public void testMirror() {
        BinTree<Integer> result = emptyTree().mirror();
        assertEquals(0, result.nodes());

        assertEquals(5, tree1().mirror().nodes());
        assertEquals(5, tree2().mirror().nodes());
        assertEquals(3, tree1().mirror().height());
        assertEquals(5, tree2().mirror().height());
    }

    private static <T> void assertPrintAllOrder(BinTree<Integer> tree, Integer[] order) {
        PrintStream stdout = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        tree.printAll();
        System.setOut(stdout);
        String[] lines = outputStreamCaptor.toString().split("\n");

        assertEquals(order.length, lines.length);

        for (int i = 0; i < order.length; i++) {
            assertTrue(lines[i].contains(order[i].toString()));
        }
    }

    @Test
    public void testPrintAll() {
        emptyTree().printAll();

        Integer[] order = { 3, 1, 4, 0, 2 };
        assertPrintAllOrder(tree1(), order);
    }

    @Test
    public void testMirrorOrder() {
        Integer[] order = { 2, 0, 4, 1, 3 };
        assertPrintAllOrder(tree1().mirror(), order);
    }
}
