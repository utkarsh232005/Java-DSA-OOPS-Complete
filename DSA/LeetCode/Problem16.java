package dsa.LeetCode;

import java.util.Arrays;

public class Problem16 {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum < target) {
                    start++;
                } else {
                    end--;
                }
                if (sum == target) {
                    return sum;
                }
            }
        }
        return closest;
    }
}
