
public class linearSearch {

    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {3, 5, 2, 5, 2, 5, 3, 2, 10, 6, 8, 7};
        String menu[] = {"Samosa", "idli", "sambar"};
        String key = "idli";
        // int key = 10;
        int index = linearSearch(menu, key);
        System.out.println(index);

    }
}
