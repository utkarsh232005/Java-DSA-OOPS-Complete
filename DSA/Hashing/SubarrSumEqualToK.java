package DSA.Hashing;

import java.util.HashMap;

public class SubarrSumEqualToK {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            // Always add the current sum to the map for future subarrays to use
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }
}
