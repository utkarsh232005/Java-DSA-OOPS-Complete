
public class subArr {

    public static void subArr(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; //for maxSub array sum convert this to Integer.MIN_VALUE
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int curr = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = curr == 0 ? prefix[end] : prefix[end] - prefix[curr - 1];
                // for (int k = curr; k <= end; k++) {
                //     // System.out.print(num[k] + " ");
                //     currSum += num[k];
                // }
                System.out.print(currSum + " ");
                // if (maxSum < currSum) { // this for maxSub array sum
                //     maxSum = currSum;
                // }
                if (maxSum < currSum) {
                    maxSum = currSum; // this gives minSub array sum
                }
            }
            System.out.println();
        }
        System.out.println("the maximun subArr is " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6};
        subArr(num);
    }
}
