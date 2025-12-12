
import java.util.*;

public class breakState {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            int n = in.nextInt();
            System.out.print(n + " ");
            if (n % 10 == 0) {
                break;
            }
        } while (true);
        System.out.println("loop is breaked by the user thanks by the machine:)");
    }
}
