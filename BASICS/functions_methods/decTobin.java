public class decTobin {

    public static int convertDecToBin(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("The binary of the the num is " + bin);
        return bin;
    }

    public static void main(String args[]) {
        convertDecToBin(5);
    }
}
