// import java.util.Scanner;
// //Binary Number to Decimal Number
// public class binTodec {

//     public static void BinToDec(int binNum) {
//         int num = binNum;
//         int pow = 0;
//         int dec = 0;
//         while (binNum > 0) {
//             int lastDigit = binNum % 10;
//             dec = dec + (lastDigit * (int) Math.pow(2, pow));
//             pow++;
//             binNum = binNum / 10;
//         }
//         System.out.println("Decimal number of " + num + " = " + dec);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Binary Number : ");
//         int binNum = sc.nextInt();
//         sc.close();
//         BinToDec(binNum);
//     }

// }

import java.util.Scanner;

public class binTodec {

    public static void DecToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary Number of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        DecToBin(n);
    }
}