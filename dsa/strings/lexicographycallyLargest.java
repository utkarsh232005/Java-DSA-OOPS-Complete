public class lexicographycallyLargest {

    public static void main(String[] args) {
        String names[] = { "nidhi", "mahi", "utkarsh" };
        String largest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (largest.compareToIgnoreCase(names[i]) < 0) {
                largest = names[i];
            }
        }
        System.out.println(largest);
    }
}
