package Array;

public class ReverseArray {

    public static void reverse(int Array1[]) {

        int start = 0;
        int end = Array1.length - 1;

        while (start < end) {
            int temp = Array1[end];
            Array1[end] = Array1[start];
            Array1[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int Array1[] = { 2, 4, 6, 8, 10 };
        reverse(Array1);

        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i] + " ");
        }
        System.out.println();
    }
}
