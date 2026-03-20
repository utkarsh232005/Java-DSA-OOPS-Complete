package DSA.BinarySearchTree;

public class SizeBSTofBT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        boolean isBST;
        int max;
        int min;
        int size;

        public Info(boolean isBST, int min, int max, int size) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
            this.size = size;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        Info leftinfo = largestBST(root.left);
        Info rightinfo = largestBST(root.right);
        int size = leftinfo.size + rightinfo.size + 1;
        int min = Math.min(root.data, Math.min(leftinfo.min, rightinfo.min));
        int max = Math.max(root.data, Math.max(leftinfo.max, rightinfo.max));
        if (root.data <= leftinfo.max || root.data >= rightinfo.min) {
            return new Info(false, min, max, size);
        }
        if (leftinfo.isBST && rightinfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, min, max, size);
        }
        return new Info(false, min, max, size);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);
        System.out.println("Size of largest BST = " + maxBST);
    }
}
