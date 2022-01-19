
public class BinTreeNode<T> {
    T value;
    BinTreeNode<T> left;
    BinTreeNode<T> right;

    public BinTreeNode(final BinTreeNode<T> left, final T value, final BinTreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
