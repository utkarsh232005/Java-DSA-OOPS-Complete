
public class maxSubarr {

    public static void prefixSum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];//initalizing another prefix array to store the prefixSum.
        prefix[0] = num[0];
        //Calculating the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = 0; j < num.length; j++) {
                currSum = start == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.print(currSum + " ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("the max subArray sum is: " + maxSum);

    }

    public static void kadans(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currSum += num[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("the maximum sum = " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6};
        kadans(num);
    }
}
