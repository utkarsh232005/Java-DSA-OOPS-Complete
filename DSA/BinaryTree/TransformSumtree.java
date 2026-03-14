package DSA.BinaryTree;

public class TransformSumtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int transForm(Node root) {
        if (root == null) {
            return 0;
        }
        int lchild = transForm(root.left);
        int rchild = transForm(root.right);
        int data = root.data;
        int leftData = (root.left == null) ? 0 : root.left.data;
        int rightData = (root.right == null) ? 0 : root.right.data;
        root.data = leftData + lchild + rightData + rchild;
        return data;
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transForm(root);
        preorder(root);
    }
}