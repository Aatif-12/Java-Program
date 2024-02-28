package Array;

public class bigElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10, 15, 50, 44 };
        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (biggest < arr[i]) {
                biggest = arr[i];
            }
        }
        System.out.println("Biggest Element of Array is " + biggest);
    }
}
