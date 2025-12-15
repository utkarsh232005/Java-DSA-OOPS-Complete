
public class MergeSort {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }

    public static void mergeSort(int[] arr, int st, int end) {
        if (st >= end) {
            return;
        }
        //kaam kya krna hai
        int mid = st + (end - st) / 2; //(st + end)/2 can also work
        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, st, mid, end);
    }

    public static void merge(int[] arr, int st, int mid, int end) {
        //left(0-2)-> 3 and right(3-6)-> 4 then my temp = 7 here 6-0 =6+1=7
        int[] temp = new int[end - st + 1];
        int i = st; //iterator for left
        int j = mid + 1; // iterator for right
        int k = 0; //iterator for temp
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;

        }
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        //copy to temp
        for (k = 0, i = st; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
