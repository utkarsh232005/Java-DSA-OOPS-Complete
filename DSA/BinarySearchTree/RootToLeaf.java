package DSA.BinarySearchTree;

import java.util.ArrayList;

public class RootToLeaf {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void print(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printRoottoLeaf(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;
        path.add(root.data);
        if (root.left == null && root.right == null) {
            print(path);
        }
        printRoottoLeaf(root.left, path);
        printRoottoLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        printRoottoLeaf(root, new ArrayList<>());
    }
}
