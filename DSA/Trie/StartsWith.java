package DSA.Trie;

public class StartsWith {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];

        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = { "apple", "app", "mango", "man", "woman" };
        for (String word : words) {
            insert(word);
        }

        System.out.println("Starts with 'app': " + startWith("app")); // true
        System.out.println("Starts with 'moon': " + startWith("moon")); // false
        System.out.println("Starts with 'man': " + startWith("man")); // true
        System.out.println("Starts with 'wom': " + startWith("wom")); // true
    }
}
