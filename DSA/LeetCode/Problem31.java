package DSA.LeetCode;

public class Problem31 {
    public void nextPermutation(int[] nums) {
        int pt = -1, n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pt = i;
                break;
            }
        }
        if (pt == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[pt]) {
                swap(nums, i, pt);
                break;
            }
        }
        reverse(nums, pt + 1, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };
        Problem31 obj = new Problem31();
        obj.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
