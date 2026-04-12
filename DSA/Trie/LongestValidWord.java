package DSA.Trie;

public class LongestValidWord {
    class Solution {
        static class Node {
            Node[] children = new Node[26];
            boolean eow = false;

            public Node() {
                for (int i = 0; i < 26; i++) {
                    children[i] = null;
                }
            }
        }

        public Node root = new Node();

        public void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
            curr.eow = true;
        }

        public String ans = "";

        public String longestValidWord(String[] words) {
            // code here
            ans = "";
            root = new Node();
            for (int i = 0; i < words.length; i++) {
                insert(words[i]);
            }
            longestWord(root, new StringBuilder());
            return ans;
        }

        public void longestWord(Node root, StringBuilder temp) {
            if (root == null) {
                return;
            }
            for (int i = 0; i < 26; i++) {
                if (root.children[i] != null && root.children[i].eow == true) {
                    char ch = (char) (i + 'a');
                    temp.append(ch);
                    if (temp.length() > ans.length()) {
                        ans = temp.toString();

                    }
                    longestWord(root.children[i], temp);
                    temp.deleteCharAt(temp.length() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        LongestValidWord outer = new LongestValidWord();
        Solution sol = outer.new Solution();

        String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        String result = sol.longestValidWord(words);
        System.out.println("Longest valid word: " + result);
    }
}
