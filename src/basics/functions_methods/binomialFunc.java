
public class binomialFunc {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);
        int binomialEqu = factN / (factR * factNR);
        System.out.println("the binomial equation is :" + binomialEqu);

    }
}
