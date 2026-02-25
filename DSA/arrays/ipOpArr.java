
public class ipOpArr {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // int marks[] = new int[50];
        // Scanner in = new Scanner(System.in);
        // marks[0] = in.nextInt();
        // marks[1] = in.nextInt();
        // marks[2] = in.nextInt();

        // System.out.println("Math: " + marks[0]);
        // System.out.println("Chem: " + marks[1]);
        // System.out.println("Sci: " + marks[2]);
        // System.out.println(marks.length);
    }
}
