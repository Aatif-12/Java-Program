// public class invertedhalfpyramid {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class invertedhalfpyramid {
//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.Scanner;

// public class invertedhalfpyramid {

//     public static void invertedpyramid(int n) {
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (j <= n - i) {
//                     System.out.print(" ");
//                 } else {
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         invertedpyramid(n);
//         sc.close();

//     }
// }
/* uper wala
   *
  **
 ***
****
 */

//Same Output in Another Method
public class invertedhalfpyramid {

    public static void halfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        halfpyramid(n);
    }
}
