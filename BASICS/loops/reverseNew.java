public class reverseNew {

    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;// if we want to the last digit of any number we do mod of that number with 10
            rev = (rev * 10) + lastDigit;
            n = n / 10; // if we want to remove the last digit of any number we do divison of that
                        // number with 10
        }
        System.out.println(rev);
    }
}
