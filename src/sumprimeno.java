// import java.util.Scanner;

// //Sum of prime no 1 to n
// public class sumprimeno {

//     public static boolean isPrime(int n) {
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         sc.close();
//         for (int i = 1; i <= num; i++) {

//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//                 sum = sum + i;

//             }
//         }
//         System.out.println();
//         System.out.println("Sum of All Prime Number is " + sum);
//     }

// }

//Enter the range for ex 5 to 100 print prime number
import java.util.Scanner;

public class sumprimeno {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");

            }
        }

    }

}
