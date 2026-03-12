package DSA.BinaryTree;

import DSA.BinaryTree.PreOrderTraversal.Node;

public class Subtree {
    public static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }
        if (!isIdentical(node.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subroot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        // Build the main tree:
        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Build the subtree to search for:
        // 3
        // / \
        // 6 7
        Node subRoot = new Node(3);
        subRoot.left = new Node(6);
        subRoot.right = new Node(7);

        boolean result = isSubtree(root, subRoot);
        System.out.println("Is subtree: " + result); // true
    }
}
