package klausur.bintree;

public class BinTreeNode<T> {
    T value;
    BinTreeNode<T> left;
    BinTreeNode<T> right;

    public BinTreeNode(BinTreeNode<T> left, T value, BinTreeNode<T> right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }
}
