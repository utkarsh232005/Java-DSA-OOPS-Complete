
import java.util.*;

public class avg {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int first = in.nextInt();
            int second = in.nextInt();
            int third = in.nextInt();
            int sum = (first + second + third) / 3;
            System.out.println("The avg of the numbers is: " + sum);
        }
    }
}
