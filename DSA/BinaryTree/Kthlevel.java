package DSA.BinaryTree;

public class Kthlevel {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void klvl(Node root, int lvl, int k) {
        if (root == null) {
            return;
        }
        if (lvl == k) {
            System.out.print(root.data + " ");
            return;
        }
        klvl(root.left, lvl + 1, k);
        klvl(root.right, lvl + 1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        klvl(root, 3, 3);
    }
}
