
public class Consecativeones {

    public static void consecativeOnes(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        consecativeOnes(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            consecativeOnes(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 2;
        consecativeOnes(n, 0, " ");

    }
}
