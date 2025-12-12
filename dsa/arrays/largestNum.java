
public class largestNum {

    public static int Search(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 6, 3, 5};
        int largestNum = Search(num);
        System.out.println(largestNum);
    }
}
