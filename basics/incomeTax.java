
import java.util.*;

public class incomeTax {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int income = in.nextInt();
            int tax;
            if (income < 500000) {
                tax = 0;
            } else if (income >= 500000 && income < 800000) {
                tax = (int) (income * (0.2));
            } else {
                tax = (int) (income * (0.4));
            }
            System.out.println("Your tax is " + tax);
        }
    }
}
