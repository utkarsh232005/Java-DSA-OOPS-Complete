package DSA.BinarySearchTree;

public class SearchInBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static boolean searchBst(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data < key) {
            return searchBst(root.right, key);
        } else {
            return searchBst(root.left, key);
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        for (int value : values) {
            root = insert(root, value);
        }

        int key1 = 6;
        int key2 = 13;

        System.out.println("Is " + key1 + " present? " + searchBst(root, key1));
        System.out.println("Is " + key2 + " present? " + searchBst(root, key2));
    }
}
