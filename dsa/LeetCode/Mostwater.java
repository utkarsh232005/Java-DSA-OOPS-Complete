package dsa.LeetCode;

public class Mostwater {
    public static int mostWater(int height[]) {
        int n = height.length;
        int lp = 0, rp = n - 1;
        int maxWater = 0;
        while (lp < rp) {
            int width = rp - lp;
            int currHeight = Math.min(height[lp], height[rp]);
            int currWater = width * currHeight;
            maxWater = Math.max(maxWater, currWater);
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(mostWater(height));
    }
}
