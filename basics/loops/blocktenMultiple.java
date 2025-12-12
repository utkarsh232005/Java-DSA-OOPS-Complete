
import java.util.*;

public class blocktenMultiple {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            int n = in.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.print("the number you typed is " + n);

        } while (true);
        // for (n = 0; n <= 10; n++) {
        //     if (n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println(n);
        // }
    }
}
