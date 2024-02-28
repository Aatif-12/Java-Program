package Array;

public class sameelement {
    public static void main(String[] args) {
        int arr1[] = { 10, 20, 30, 60, 80, 100, 80 };
        int arr2[] = { 10, 14, 16, 20, 80, 25, 101 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    int matchValue = arr1[i];
                    for (int k = j; k < arr1.length; k++) {
                        if (matchValue == arr1[k]) {
                            arr1[k] = Integer.MIN_VALUE;
                        }
                    }

                }
            }
        }
    }
}
