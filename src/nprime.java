//// import java.util.Scanner;
//
//// public class nprime {
//
//// public static boolean isPrime(int num) {
//// for (int i = 2; i * i <= num; i++) {
//// if (num % i == 0) {
//// return false;
//// }
//// }
//// return true;
//// }
//
//// public static void main(String[] args) {
//// Scanner sc = new Scanner(System.in);
//// System.out.println("Enter the Number :");
//// int num = sc.nextInt();
//// sc.close();
//// System.out.println("Prime Numbers are : ");
//// for (int i = 1; i <= num; i++) {
//// if (isPrime(i)) {
//// System.out.print(i + " ");
//// }
//// }
//// }
//// }
//

//1 to n prime no print
// import java.util.Scanner;

// public class nprime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt(); // 10
//         sc.close();
//         for (int i = 1; i <= num; i++) {
//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//     public static boolean isPrime(int n) {
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;

//     }

// }

import java.util.Scanner;

public class nprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 10
        sc.close();
        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");

            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
