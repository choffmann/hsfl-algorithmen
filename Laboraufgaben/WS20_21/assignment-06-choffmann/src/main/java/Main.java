
public class Main {

    public static void main(String[] args) {
        BinTree<Integer> one = tree1();
        BinTree<Integer> two = one.mirror();
    }

    private static BinTree<Integer> tree1() {
        BinTreeNode<Integer> four = new BinTreeNode<>(null, 4, null);
        BinTreeNode<Integer> three = new BinTreeNode<>(null, 3, null);
        BinTreeNode<Integer> two = new BinTreeNode<>(null, 2, null);
        BinTreeNode<Integer> one = new BinTreeNode<>(three, 1, four);
        BinTreeNode<Integer> root = new BinTreeNode<>(one, 0, two);
        return new BinTree<>(root);
    }
}
