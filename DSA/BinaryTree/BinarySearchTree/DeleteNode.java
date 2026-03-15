package DSA.BinaryTree.BinarySearchTree;

public class DeleteNode {
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

    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node inorderSuccessor = findInorderSuccessor(root.right);
            root.data = inorderSuccessor.data;
            root.right = deleteNode(root.right, inorderSuccessor.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        for (int value : values) {
            root = insert(root, value);
        }

        System.out.print("Inorder before deletion: ");
        inOrder(root);
        System.out.println();

        root = deleteNode(root, 10);
        root = deleteNode(root, 5);

        System.out.print("Inorder after deletion: ");
        inOrder(root);
        System.out.println();
    }
}
