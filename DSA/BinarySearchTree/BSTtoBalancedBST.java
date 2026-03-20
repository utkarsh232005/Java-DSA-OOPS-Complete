package DSA.BinarySearchTree;

import java.util.ArrayList;

public class BSTtoBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node balanceBST(Node root) {
        // step 1: Inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        // step 2: Create BST using inorder seq
        root = creatBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node creatBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = creatBST(inorder, st, mid - 1);
        root.right = creatBST(inorder, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = { 10, 5, 15, 2, 7, 12, 20, 1, 3, 6, 8 };

        for (int value : values) {
            root = insert(root, value);
        }

        System.out.print("Preorder before balancing: ");
        preOrder(root);
        System.out.println();

        root = balanceBST(root);

        System.out.print("Preorder after balancing: ");
        preOrder(root);
        System.out.println();
    }
}
