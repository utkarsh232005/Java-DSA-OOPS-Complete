package DSA.Stack;

import java.util.*;

public class PushAtBottom {
    public static void pushAtbottom(Stack<Integer> s, int k) {
        if (s.isEmpty()) {
            s.push(k);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, k);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtbottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
