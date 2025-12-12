
public class functionOverloading {//this type of function overloading is called as parameter function overloading

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 4));
        System.out.println(sum(1, 1, 4));
    }
}
