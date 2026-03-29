package DSA.Hashing;

import java.util.ArrayList;
import java.util.List;

import java.util.HashMap;

public class MajorityElements {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MajorityElements obj = new MajorityElements();

        // Test case 1
        int[] nums1 = { 3, 2, 3 };
        System.out.println("Majority elements for nums1: " + obj.majorityElement(nums1));

        // Test case 2
        int[] nums2 = { 1, 2, 3, 1, 1, 2, 2 };
        System.out.println("Majority elements for nums2: " + obj.majorityElement(nums2));
    }
}
