package DSA.BinaryTree;

public class KthAncestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int kAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int left = kAncestor(root.left, n, k);
        int right = kAncestor(root.right, n, k);
        if (left == -1 && right == -1) {
            return -1;
        }
        int max = Math.max(left, right);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // 2nd ancestor of node 5 is 1 in this tree.
        kAncestor(root, 5, 2);
    }
}