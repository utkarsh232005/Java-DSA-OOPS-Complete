package DSA.Hashing;

import java.util.HashMap;

public class SubarraySumZero {
    public static int getLongestSubarrayWithZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        map.put(0, -1);
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 6, 3, -6, -5, -6, -5, -4, -7 };
        System.out.println(getLongestSubarrayWithZeroSum(arr));
    }
}