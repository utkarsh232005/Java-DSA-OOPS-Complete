
import java.util.*;

public class factorial {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        try (Scanner in = new Scanner(System.in)) {

            System.out.println("Enter a non-negative integer to find its factorial:");
            int number = in.nextInt();

            // Handle negative numbers, which do not have a factorial
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1; // Use 'long' to handle larger numbers

                // Calculate the factorial using a for loop
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                System.out.println("The factorial of " + number + " is: " + factorial);
            }

            // Close the scanner
            in.close();
        }
    }
}
