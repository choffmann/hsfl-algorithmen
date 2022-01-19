package de.fuas.algorithms;

public class BinTree<Int> {
    private BinTreeNode<Integer> root;

    public BinTree(final BinTreeNode<Integer> root) {
        this.root = root;
    }

    public int countNodes() {
        return countNodes(this.root);
    }

    private int countNodes(final BinTreeNode<Integer> current) {
        if (current == null) {
            return 0;
        } else {
            return 1 + countNodes(current.left) + countNodes(current.right);
        }
    }

    public int sum() {
        return sum(this.root);
    }

    private int sum(final BinTreeNode<Integer> current) {
        if (current == null) {
            return 0;
        } else {
            return current.value + sum(current.left) + sum(current.right);
        }
    }

    public ArrayList<Integer> entries() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        entries(this.root, list);
        return list;
    }

    private void entries(final BinTreeNode<Integer> current, final ArrayList<Integer> list) {
        if (current != null) {
            entries(current.left, list);
            list.add(list.size(), current.value);
            entries(current.right, list);
        }
    }
}
