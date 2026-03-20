package DSA.BinarySearchTree;

public class InvertBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftSub = mirror(root.left);
        Node rightSub = mirror(root.right);
        root.left = rightSub;
        root.right = leftSub;
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        System.out.print("Preorder before mirror: ");
        preorder(root);
        System.out.println();

        root = mirror(root);

        System.out.print("Preorder after mirror: ");
        preorder(root);
        System.out.println();
    }
}
