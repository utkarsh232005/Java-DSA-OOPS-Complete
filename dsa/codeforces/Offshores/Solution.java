package dsa.codeforces.Offshores;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            long x = fs.nextLong();
            long y = fs.nextLong();

            long[] a = new long[n];
            long sum = 0;
            long maxA = 0;
            int maxIdx = 0;

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
                sum += a[i];
                if (a[i] > maxA) {
                    maxA = a[i];
                    maxIdx = i;
                }
            }

            if (x == y) {
                out.append(sum).append('\n');
                continue;
            }

            long gain = 0;
            for (int i = 0; i < n; i++) {
                if (i == maxIdx)
                    continue;
                gain += (a[i] / x) * y;
            }

            long ans = maxA + gain;
            out.append(ans).append('\n');
        }

        System.out.print(out.toString());
    }

    // Fast input reader
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

        long nextLong() throws IOException {
            int c, sgn = 1;
            long res = 0;
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
}
