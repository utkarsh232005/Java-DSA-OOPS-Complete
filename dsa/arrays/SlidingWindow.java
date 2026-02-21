package dsa.arrays;

public class SlidingWindow {
    public static int maxSubarr(int[] arr, int w) {
        int curr = 0;
        int n = arr.length;
        for (int i = 0; i < w; i++) {
            curr += arr[i];
        }
        int max = curr;
        for (int i = 1; i < n - w; i++) {
            curr = curr - arr[i - 1] + arr[i + w - 1];
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 67, 8 };
        System.out.println(maxSubarr(arr, 4));
    }
}
