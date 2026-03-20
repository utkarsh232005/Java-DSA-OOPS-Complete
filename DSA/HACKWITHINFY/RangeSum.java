package DSA.HACKWITHINFY;

import java.util.Scanner;

public class RangeSum {
    // private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] A = new long[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }

        int q = sc.nextInt();
        int[][] queries = new int[q][4];

        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt(); // l
            queries[i][1] = sc.nextInt(); // r
            queries[i][2] = sc.nextInt(); // x
            queries[i][3] = sc.nextInt(); // y
        }

        long answer = 0;
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int x = queries[i][2];
            int y = queries[i][3];

            for (int j = l; j <= r; j++) {
                A[j] = x + (j - l) * y;
            }
        }
        for (int i = 0; i < A.length; i++) {
            answer += A[i];
        }
        System.out.println(answer);
        sc.close();
    }
}