package DSA.Stack;

import java.util.Stack;

public class Stockspan {
    public static int[] stockSpan(int stock[]) {
        Stack<Integer> s = new Stack<>();
        int[] span = new int[stock.length];
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
        return span;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 23, 42, 56, 95, 100 };
        print(stockSpan(stocks));
    }
}
