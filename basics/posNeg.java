
import java.util.*;

public class posNeg {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int input = in.nextInt();
            if (input >= 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
        }
    }
}
