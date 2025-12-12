
import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("---- Simple Calculator ----");
        System.out.print("Enter A: ");
        while (!in.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a number: ");
            in.next();
        }
        double a = in.nextDouble();

        System.out.print("Enter B: ");
        while (!in.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a number: ");
            in.next();
        }
        double b = in.nextDouble();

        System.out.print("Enter Operator (+, -, *, /, %): ");
        char operator = in.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Your answer is: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Your answer is: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Your answer is: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Your answer is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                    System.out.println("Your answer is: " + result);
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, /, or %.");
        }

        in.close();
    }
}
