package DSA.QUEUE;

import java.util.*;

public class FirstNonRepeating {
    public static void nonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.println(-1 + " ");
            } else {
                System.out.println(q.peek() + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String str1 = "abacabad";
        System.out.println("Input: " + str1);
        System.out.print("First Non-Repeating: ");
        nonRepeating(str1);

        System.out.println("\n---");

        String str2 = "aabccxb";
        System.out.println("Input: " + str2);
        System.out.print("First Non-Repeating: ");
        nonRepeating(str2);
    }
}