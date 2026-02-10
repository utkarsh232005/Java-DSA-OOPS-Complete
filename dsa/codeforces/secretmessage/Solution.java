package dsa.codeforces.secretmessage;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            String[] strips = new String[k];
            for (int i = 0; i < k; i++) {
                strips[i] = fs.next();
            }

            char[] ans = new char[n];

            // Try only valid periods d that divide n
            for (int d = 1; d <= n; d++) {
                if (n % d != 0)
                    continue; // 🔥 Critical fix

                boolean ok = true;
                char[] pick = new char[d];

                for (int r = 0; r < d; r++) {
                    int mask = (1 << 26) - 1; // all letters allowed initially

                    for (int pos = r; pos < n; pos += d) {
                        int curMask = 0;
                        for (int i = 0; i < k; i++) {
                            char c = strips[i].charAt(pos);
                            curMask |= (1 << (c - 'a'));
                        }
                        mask &= curMask;

                        if (mask == 0) {
                            ok = false;
                            break;
                        }
                    }

                    if (!ok)
                        break;

                    // pick any available character
                    int chosen = Integer.numberOfTrailingZeros(mask);
                    pick[r] = (char) ('a' + chosen);
                }

                if (ok) {
                    // Build the answer using this period
                    for (int i = 0; i < n; i++) {
                        ans[i] = pick[i % d];
                    }
                    break;
                }
            }

            out.append(new String(ans)).append('\n');
        }

        System.out.print(out.toString());
    }

    // Fast input
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

        String next() throws IOException {
            int c;
            StringBuilder sb = new StringBuilder();
            do {
                c = readByte();
            } while (c <= ' ');
            while (c > ' ') {
                sb.append((char) c);
                c = readByte();
            }
            return sb.toString();
        }
    }
}
