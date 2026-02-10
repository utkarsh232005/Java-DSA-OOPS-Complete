package dsa.codeforces.tablecut;

import java.io.*;
import java.util.*;

public class Solution {

    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0)
                    return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sgn = 1, res = 0;
            do {
                c = readByte();
            } while (c <= ' ');
            if (c == '-') {
                sgn = -1;
                c = readByte();
            }
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = readByte();
            }
            return res * sgn;
        }
    }

    static long distToInterval(long x, long l, long r) {
        if (x < l)
            return l - x;
        if (x > r)
            return x - r;
        return 0;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();

            int[][] a = new int[n][m];
            long total = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = fs.nextInt();
                    total += a[i][j];
                }
            }

            // rowSuf[i][j] = sum a[i][j..m-1]
            long[][] rowSuf = new long[n][m];
            for (int i = 0; i < n; i++) {
                long s = 0;
                for (int j = m - 1; j >= 0; j--) {
                    s += a[i][j];
                    rowSuf[i][j] = s;
                }
            }

            // colSuf[i][j] = sum a[i..n-1][j]
            long[][] colSuf = new long[n][m];
            for (int j = 0; j < m; j++) {
                long s = 0;
                for (int i = n - 1; i >= 0; i--) {
                    s += a[i][j];
                    colSuf[i][j] = s;
                }
            }

            // minRem and maxRem for each cell (i,j): additional ones achievable starting
            // FROM (i,j)
            long[][] minRem = new long[n][m];
            long[][] maxRem = new long[n][m];

            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (i == n - 1 && j == m - 1) {
                        minRem[i][j] = 0;
                        maxRem[i][j] = 0;
                    } else if (i == n - 1) {
                        // can only go right
                        long addR = colSuf[i][j];
                        minRem[i][j] = addR + minRem[i][j + 1];
                        maxRem[i][j] = addR + maxRem[i][j + 1];
                    } else if (j == m - 1) {
                        // can only go down
                        long addD = rowSuf[i][j];
                        minRem[i][j] = addD + minRem[i + 1][j];
                        maxRem[i][j] = addD + maxRem[i + 1][j];
                    } else {
                        long addR = colSuf[i][j];
                        long addD = rowSuf[i][j];
                        minRem[i][j] = Math.min(addR + minRem[i][j + 1], addD + minRem[i + 1][j]);
                        maxRem[i][j] = Math.max(addR + maxRem[i][j + 1], addD + maxRem[i + 1][j]);
                    }
                }
            }

            // Walk greedily using interval distances
            int i = 0, j = 0;
            long cur = 0; // ones collected so far
            StringBuilder path = new StringBuilder();

            while (i < n - 1 || j < m - 1) {
                char bestMove = 'R';
                long bestDist = Long.MAX_VALUE;

                long target = total / 2;

                if (j < m - 1) {
                    long addR = colSuf[i][j];
                    long nc = cur + addR;
                    long lo = nc + minRem[i][j + 1];
                    long hi = nc + maxRem[i][j + 1];
                    long dist = distToInterval(target, lo, hi);
                    bestDist = dist;
                    bestMove = 'R';
                }

                if (i < n - 1) {
                    long addD = rowSuf[i][j];
                    long nc = cur + addD;
                    long lo = nc + minRem[i + 1][j];
                    long hi = nc + maxRem[i + 1][j];
                    long dist = distToInterval(target, lo, hi);
                    if (dist < bestDist) {
                        bestDist = dist;
                        bestMove = 'D';
                    }
                }

                if (bestMove == 'R') {
                    cur += colSuf[i][j];
                    j++;
                    path.append('R');
                } else {
                    cur += rowSuf[i][j];
                    i++;
                    path.append('D');
                }
            }

            long a1 = cur;
            long b1 = total - a1;
            out.append(a1 * b1).append('\n');
            out.append(path).append('\n');
        }

        System.out.print(out.toString());
    }
}
