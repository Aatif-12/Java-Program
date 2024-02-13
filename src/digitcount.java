// import java.util.Scanner;

// public class digitcount {
//     public static void main(String[] args) {
//         int digitcount = 0;
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         sc.close();
//         while (num > 0) {
//             num = num / 10;
//             digitcount++;

//         }
//         System.out.println(digitcount);
//     }
// }

import java.util.Scanner;

public class digitcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(digitCount(num));
    }

    public static int digitCount(int n) {
        int digitCount = 0;
        if (n == 0) {
            return 1;
        } else {
            while (n != 0) {
                n = n / 10;
                digitCount++;
            }
            return digitCount;
        }
    }
}
