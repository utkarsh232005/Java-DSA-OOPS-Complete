public class SortedRotated {

    public static int search(int[] arr, int target, int start, int end) {
        // int start = 0;
        // int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }

        // case where mid == target
        if (arr[mid] == target) {
            return mid;
        }
        // case where mid is on l1
        if (arr[start] <= arr[mid]) {
            // case 1 : left
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                // case 2: right
                return search(arr, target, mid + 1, end);
            }

        } else {
            // mid is on l2
            // case 1 : left
            if (arr[mid] <= target && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            } else {
                // case 2: right
                return search(arr, target, start, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;
        System.out.println(search(arr, key, 0, arr.length - 1));
    }
}
