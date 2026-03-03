package DSA.Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = { "(())", // Duplicate - empty parentheses inside
                "((a+b))", // Duplicate - extra parentheses around entire expression
                "(a+b)", // No duplicate
                "(a+(b))", // No duplicate
                "((a)+(b))", // Duplicate - outer parentheses are redundant
                "(a+b)*(c+d)", // No duplicate
                "((a+b))", // Duplicate
                "(a)", // Duplicate - single element in parentheses
                "((()))", // Duplicate - multiple layers of empty parentheses
                "(a+b+c)" // No duplicate
        };

        System.out.println("Testing DuplicateParenthesis.isDuplicate():\n");
        for (String testCase : testCases) {
            boolean result = isDuplicate(testCase);
            System.out.println("Input: \"" + testCase + "\" => Duplicate: " + result);
        }
    }
}
