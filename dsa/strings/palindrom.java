
// public class palindrom {
//     public static boolean ispalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String name = "racear";
//         System.out.println(ispalindrome(name));
//     }
// }
public class palindrom {

    public static boolean ispalindrome(String str) {
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                count++;
            }
        }
        if (count == n / 2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "utkarsh";
        System.out.println(ispalindrome(str));
    }
}
