public class binTodec {

    public static void convertBinToDec(int n) {
        int enterBin = n;
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int lastDig = n % 10;
            dec = dec + (lastDig * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;

        }
        System.out.println("The decimal number of the binary num " + enterBin + " = " + dec);
    }

    public static void main(String[] args) {
        convertBinToDec(101);
    }
}
