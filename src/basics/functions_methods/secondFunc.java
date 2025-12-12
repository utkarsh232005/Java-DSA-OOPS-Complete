
import java.util.*;

public class secondFunc {

    public static int calculateSum(int num1, int num2) {//num1 and num2 are paramenter or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = calculateSum(a, b);//a and b are the arguments or actual parameters
        System.out.println("sum is: " + sum);
    }
}
