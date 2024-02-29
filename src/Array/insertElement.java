package Array;

import java.util.Scanner;

// public class insertElement {
//     public static void main(String[] args) {
//         int arr[] = { 10, 20, 30, 40, 50, 60, 20, 100 };
//         int element = 100000;
//         int index = 2;
//         int arr1[] = new int[arr.length + 1];

//         for (int i = 0, j = 0; i < arr1.length; i++) {
//             if (i == index) {
//                 arr1[index] = element;
//             } else {
//                 arr1[i] = arr[j];
//                 j++;
//             }
//         }
//         for (int i = 0; i < arr1.length; i++) {
//             System.out.println(arr1[i]);
//         }
//     }
// }

public class insertElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60, 20, 100 };

        System.out.println("Enter the Element :");
        int element = sc.nextInt();
        System.out.println("Enter the Index :");
        int index = sc.nextInt();
        int newArr[] = new int[arr.length + 1];
        sc.close();

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[index] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}