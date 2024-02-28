package Array;

public class insertElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 20, 100 };
        int element = 100000;
        int index = 2;
        int arr1[] = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (i == index) {
                arr1[index] = element;
            } else {
                arr1[i] = arr[j];
                j++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
