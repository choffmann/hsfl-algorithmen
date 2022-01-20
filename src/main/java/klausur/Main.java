package klausur;

import klausur.backtracking.Backtracking;
import klausur.bintree.BinTree;
import klausur.bintree.BinTreeNode;
import klausur.schnitt.Schnitt;
import klausur.sllist.Node;
import klausur.sllist.SLList;
import klausur.stack.Stack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // stack();
        binTree();
        //SLList();
        //schnitt();
        //addSpaces();
        /*String word = "a_bc";
        int index = 3;
        String c1 = word.substring(0, index) + "_" + word.substring(index, word.length());
        System.out.println(c1);*/
    }

    public static void stack() {
        Stack<Integer> stack = new Stack();

        stack.push(2);
        stack.push(3);
        stack.push(1);

        // Should be 2
        System.out.println(stack.remove());
        // Should be 3
        System.out.println(stack.remove());
    }

    public static void binTree() {
        BinTreeNode<Integer> b1 = new BinTreeNode<Integer>(null, 1, null);
        BinTreeNode<Integer> b2 = new BinTreeNode<Integer>(null, 2, null);
        BinTreeNode<Integer> b3 = new BinTreeNode<Integer>(b1, -4, b2);
        BinTreeNode<Integer> b4 = new BinTreeNode<Integer>(null, -10, null);
        BinTreeNode<Integer> b5 = new BinTreeNode<Integer>(b3, -6, b4);

        BinTree<Integer> tree = new BinTree<Integer>(b5);
        System.out.println(BinTree.minimum(tree));
    }

    public static void SLList() {
        Node<String> d = new Node<>("d",null);
        Node<String> c = new Node<>("c",d);
        Node<String> b = new Node<>("b",c);
        Node<String> a = new Node<>("a",b);
        SLList<String> sllist = new SLList<String>(a);

        System.out.println("Index of 'c' should be 2, is: " + sllist.indexOf("c"));
        System.out.println("Index of 'a' should be 0, is: " + sllist.indexOf("a"));
        System.out.println("Index of 'b' should be 1, is: " + sllist.indexOf("b"));
    }

    public static void schnitt() {
        int[] array1 = {1, 3, 6, 3, 2, 4, 7};
        int[] array2 = {1, 2, 5, 7};

        List<Integer> intersec = Schnitt.intersect(array1, array2);

        System.out.println("Numbers should be {1, 2, 7}, is:");
        for (int i = 0; i < intersec.size(); i++) {
            System.out.print(intersec.get(i) + ", ");
        }
    }

    public static void addSpaces() {
        String word = "abc";
        List<String> result = Backtracking.addSpaces(word);

        System.out.println("Result should be {abc, a_bc, ab_c, a_b_c}, is:");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + ", ");
        }
    }
}
