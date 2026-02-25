public class Friendspair {

    public static int numOfpair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // choices
        int fnm1 = numOfpair(n - 1);
        // pairs
        int fnm2 = numOfpair(n - 2);
        int pairWays = (n - 1) * fnm2;
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.print(numOfpair(n));
    }
}
