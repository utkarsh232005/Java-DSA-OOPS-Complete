public class factorial {

    public static int fac(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static void main(String[] args) {
        int fact = fac(4);
        System.out.println("factorial is : " + fact);
    }
}
