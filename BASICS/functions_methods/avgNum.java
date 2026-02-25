public class avgNum {

    public static int calculateAvg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.print(avg);
        return avg;
    }

    public static void main(String[] args) {
        calculateAvg(2, 3, 4);
    }
}
