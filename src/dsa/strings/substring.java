
public class substring {

    public static String substr(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "Mainjavaclasses";
        int si = 2;
        int ei = 6;
        System.out.println(substr(str, si, ei));
    }
}
