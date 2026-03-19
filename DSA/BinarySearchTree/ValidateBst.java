package DSA.BinarySearchTree;

public class ValidateBst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean check(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max != null && root.data >= max.data) {
            return false;
        }
        return check(root.left, min, root) && check(root.right, root, max);
    }

    public static void main(String[] args) {
        Node validRoot = new Node(8);
        validRoot.left = new Node(5);
        validRoot.right = new Node(10);
        validRoot.left.left = new Node(3);
        validRoot.left.right = new Node(6);
        validRoot.right.right = new Node(11);

        Node invalidRoot = new Node(8);
        invalidRoot.left = new Node(5);
        invalidRoot.right = new Node(10);
        invalidRoot.left.left = new Node(3);
        invalidRoot.left.right = new Node(9);

        System.out.println("Valid tree is BST: " + check(validRoot, null, null));
        System.out.println("Invalid tree is BST: " + check(invalidRoot, null, null));
    }
}
