
import java.util.*;

public class solutionThree {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            float pencil = in.nextInt();
            float pen = in.nextInt();
            float eraser = in.nextInt();
            double sum = pencil + pen + eraser;
            double gst = sum * 0.18;
            double total = sum + gst;
            System.out.println(total);
        }
    }
}
