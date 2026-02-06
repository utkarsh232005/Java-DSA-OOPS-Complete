import java.util.*;

public class tableMultiplication {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int input = in.nextInt();
            for (int i = 0; i <= 10; i++) {
                int multiply = input * i;
                System.out.println(input + " * " + i + " = " + multiply);

            }
        }
    }
}
