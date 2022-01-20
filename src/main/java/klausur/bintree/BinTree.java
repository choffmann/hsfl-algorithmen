package klausur.bintree;

public class BinTree<T> {
    private BinTreeNode<T> root;

    public BinTree(BinTreeNode<T> root) {
        this.root = root;
    }

    public static Integer minimum(BinTree<Integer> tree) {
        return minimum(tree.root, tree.root.value);
    }

    private static Integer minimum(BinTreeNode<Integer> current, Integer min) {
        if(current == null) {
            return min;
        } else {
            int minimum = Math.min(min, current.value);
            return Math.min(minimum(current.left, minimum), minimum(current.right, minimum));
        }
    }
}
