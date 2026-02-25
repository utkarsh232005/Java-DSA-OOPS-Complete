import java.util.*;

public class naturalSum {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;
            int counter = 0;
            int n = in.nextInt();
            while (counter <= n) {
                sum += counter;
                counter++;
            }
            System.out.println(sum);
        }
    }
}
