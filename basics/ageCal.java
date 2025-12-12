
import java.util.*;

public class ageCal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        if (A >= 18) {
            System.out.println("Adult");
        } else if (A >= 13 && A < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }

    }
}
