package Array;

public class deleteEle {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 20, 100 };
        int index = 2;
        int arr1[] = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
