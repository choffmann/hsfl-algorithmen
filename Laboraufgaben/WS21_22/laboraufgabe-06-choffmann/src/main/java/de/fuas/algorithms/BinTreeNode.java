package de.fuas.algorithms;

public class BinTreeNode<T> {
    BinTreeNode<T> left;
    BinTreeNode<T> right;
    T value;

    public BinTreeNode(final BinTreeNode<T> left, final T value, final BinTreeNode<T> right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

}
