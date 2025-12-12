
public class isprime {
//below code is standard way to find theb num is prime or not 
    // public static boolean isPrime(int n) {
    //     boolean isprime = true;
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             isprime = false;
    //         }
    //     }
    //     return isprime;
    // }

//below code is the optimized way to find the num is prime or not as the loop will be run only upto the number in which they are unique
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.print(i);
            } else {
                System.out.println("it is not prime");
            }
        }
    }
}
