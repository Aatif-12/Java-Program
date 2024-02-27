package Array;

public class elementfound {
    public static void main(String[] args) {
        int arr[] = { 500, 100, 200, 100, 500 };
        int key = 500;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
            if (count == 2) {
                System.out.println("Secont Occurrance is found " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}
