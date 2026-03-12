package DSA.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();

            List<List<Integer>> ans = new ArrayList<>();
            if (root == null)
                return ans;
            q.add(root);
            q.add(null);
            List<Integer> level = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode curr = q.remove();
                if (curr == null) {
                    ans.add(level);
                    level = new ArrayList<>();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    level.add(curr.val);
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
            return ans;
        }
    }
}
