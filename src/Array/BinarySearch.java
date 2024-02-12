package Array;

public class BinarySearch {
    public static int BinSearch(int Array[], int key) {
        int start = 0;
        int end = Array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Comparisions
            if (Array[mid] == key) { // found
                return mid;
            } else if (Array[mid] < key) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // binary search are always sorted in ascending or decesnding order.
        int Array[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("Index for key is : " + BinSearch(Array, key));
    }
}
