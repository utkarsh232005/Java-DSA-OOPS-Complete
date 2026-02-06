public class continueState {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i == 3 || i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
