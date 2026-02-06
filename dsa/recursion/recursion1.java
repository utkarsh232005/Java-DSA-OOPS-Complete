public class recursion1 {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int printFac(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = printFac(n - 1);
        int fn = n * fnm1;
        return fn;

    }

    public static int natSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum1 = natSum(n - 1);
        int sum = n + sum1;
        return sum;
    }

    public static int fab(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fab1 = fab(n - 1);
        int fab2 = fab(n - 2);
        int fab = fab1 + fab2;
        return fab;
    }

    public static boolean isSort(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSort(arr, i + 1);

    }

    public static int firstOcc(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, i + 1, key);
    }

    public static int lastOcc(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xm = x * xnm1;
        return xm;

    }

    public static void main(String[] args) {
        int n = 0;
        int arr[] = { 1, 2, 3, 4, 5, 6, 5 };
        System.out.println(lastOcc(arr, n, 5));
        System.out.println(power(2, 10));

    }
}
