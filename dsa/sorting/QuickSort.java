public class QuickSort {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pvtIdx = partition(arr, si, ei);
        sort(arr, si, pvtIdx - 1);// left part
        sort(arr, pvtIdx + 1, ei);

    }

    public static int partition(int[] arr, int si, int ei) {
        int pvot = arr[ei];
        int i = si - 1; // make place for the smaller numbers then pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pvot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pvot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 2, 5 };
        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
