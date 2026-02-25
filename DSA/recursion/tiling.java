public class tiling {

    public static int tilingSol(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        // take the vertical choice
        int verticalTile = tilingSol(n - 1);
        // take the horizontal choice
        int horiTile = tilingSol(n - 2);
        int maxWays = verticalTile + horiTile;
        return maxWays;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(tilingSol(n));
    }
}
