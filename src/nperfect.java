// import java.util.Scanner;

// public class nperfect {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number :");
//         int num = sc.nextInt();
//         sc.close();
//         int ans = 0;

//         for (int j = 2; j <= num; j++) {
//             for (int i = 1; i < j; i++) {
//                 if (j % i == 0) {
//                     ans = ans + i;
//                 }
//             }
//             if (ans == j) {
//                 System.out.println(j + " ");
//             }
//             ans = 0;
//         }

//     }
// }

import java.util.Scanner;

public class nperfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int N = sc.nextInt();
        sc.close();

        System.out.println("Numbers between 1 and " + N + " that are perfect number:");
        for (int i = 1; i <= N; i++) {
            if (fact(i) == i) {
                System.out.print(i + " ");
            }
        }

    }

    public static int fact(int num) {
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count += i;

            }
        }
        return count;

    }
}
