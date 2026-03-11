package DSA.LeetCode;

public class Problem543 {
    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
     */
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public int diameterOfBinaryTree(TreeNode root) {
            // Defaulting to optimized approach.
            return diameterOfBinaryTreeOptimized(root);
        }

        // Approach 1: Optimized (single traversal, O(n)).
        public int diameterOfBinaryTreeOptimized(TreeNode root) {
            return diameter(root).diam;
        }

        // Approach 2: Brute force (recomputes height, O(n^2)).
        public int diameterOfBinaryTreeBruteForce(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int ld = diameterOfBinaryTreeBruteForce(root.left);
            int rd = diameterOfBinaryTreeBruteForce(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int selfDia = lh + rh;

            return Math.max(selfDia, Math.max(ld, rd));
        }

        private static Info diameter(TreeNode root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);
            int diam = Math.max(leftInfo.ht + rightInfo.ht, Math.max(leftInfo.diam, rightInfo.diam));
            int ht = Math.max(rightInfo.ht, leftInfo.ht) + 1;

            return new Info(diam, ht);
        }

        private static int height(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }
    }
}
