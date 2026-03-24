package DSA.Heap;

import java.util.PriorityQueue;

public class NearByCars {
    static class Points implements Comparable<Points> {
        int x;
        int y;
        int distSq;

        public Points(int x, int y, int distSq) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Points p2) {
            return this.distSq - p2.distSq;
        }
    }

    public static int[][] kClosest(int[][] points, int k) {
        int ans[][] = new int[k][2];
        PriorityQueue<Points> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int distSq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new Points(points[i][0], points[i][1], distSq));
        }
        for (int i = 0; i < k; i++) {
            Points p = pq.remove();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        int[][] ans = kClosest(points, k);
        System.out.println("The " + k + " closest points to the origin are:");
        for (int i = 0; i < ans.length; i++) {
            System.out.println("[" + ans[i][0] + ", " + ans[i][1] + "]");
        }
    }
}
