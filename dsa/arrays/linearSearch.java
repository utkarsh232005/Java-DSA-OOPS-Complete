
public class linearSearch {

    public static int findIndex(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = { "Samosa", "idli", "sambar" };
        String key = "idli";
        // int key = 10;
        int index = findIndex(menu, key);
        System.out.println(index);

    }
}
