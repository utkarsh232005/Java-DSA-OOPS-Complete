package DSA.Greedy;

public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        int count = 0;
        int amount = 590;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] < amount) {
                while (coins[i] <= amount) {
                    count++;
                    amount -= coins[i];
                }
            }
        }
        System.out.println(count);
    }
}
