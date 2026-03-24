package DSA.Heap;

import java.util.PriorityQueue;

public class ConnectNropes {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min + min2);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 3, 2, 6 };
        System.out.println("Minimum cost to connect ropes: " + minCost(arr1));

        int[] arr2 = { 2, 5, 4, 8, 6, 9 };
        System.out.println("Minimum cost to connect ropes: " + minCost(arr2));
    }
}
