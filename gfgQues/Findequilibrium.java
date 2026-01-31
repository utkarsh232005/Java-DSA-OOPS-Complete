
public class Findequilibrium {

    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        long leftSum = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (leftSum == totalSum) {
                return idx;
            }
            leftSum += arr[idx];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 5, 5};
        System.out.println(findEquilibrium(arr));
    }
}
