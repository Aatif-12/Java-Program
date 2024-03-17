package Array;

//Second Biggest Element 
public class Secondbigele {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 50, 100, 60, 100, 80 };
        int big = Integer.MIN_VALUE; // 10 20 50 60 100
        int big2 = Integer.MIN_VALUE; // 10 20 50 60

        for (int i = 0; i < arr.length; i++) { // 0 1 2 3 4 5 6
            if (big < arr[i]) {
                big = arr[i]; //
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (big2 < arr[i] && arr[i] < big) {
                big2 = arr[i];
            }
        }
        System.out.println(big2);
    }
}
