package DSA.QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Interleav_two_Half {
    public static void interleaveHalf(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10000; i++) {
            q.add(i);
        }

        System.out.println("Before interleaving: " + q);
        interleaveHalf(q);
        System.out.println("After interleaving: " + q);
    }
}
