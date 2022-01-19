
public class BinTree<T> {

    private BinTreeNode<T> root;

    public BinTree(final BinTreeNode<T> root) {
        this.root = root;
    }

    public int nodes() {
        return nodes(this.root);
    }

    private int nodes(final BinTreeNode<T> current) {
        if (current == null) {
            return 0;
        } else {
            return 1 + nodes(current.left) + nodes(current.right);
        }
    }

    public int height() {
        return height(this.root);
    }

    private int height(final BinTreeNode<T> current) {
        if (current == null) {
            return 0;
        } else {
            return 1 + Math.max(height(current.left), height(current.right));
        }
    }

    public void printAll() {
        printAll(this.root);
    }

    private void printAll(final BinTreeNode<T> current) {
        if (current != null) {
            printAll(current.left);
            System.out.println(current.value);
            printAll(current.right);
        }
    }

    public BinTree<T> mirror() {
        return new BinTree<T>(mirror(this.root));
    }

    private BinTreeNode<T> mirror(final BinTreeNode<T> current) {
        BinTreeNode<T> mirrorTree = current;
        if (mirrorTree == null) {
            return null;
        } else {
            BinTreeNode<T> temp = mirror(mirrorTree.left);
            mirrorTree.left = mirror(mirrorTree.right);
            mirrorTree.right = temp;
            return mirrorTree;
        }
    }
}
