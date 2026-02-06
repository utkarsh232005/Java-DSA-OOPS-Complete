import java.util.*;

public class whileLoop {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int count = 1;
            int stop = in.nextInt();
            while (count <= stop) { // while always works when its true
                System.out.print(count + " ");
                count++;
            }
        }
    }
}
