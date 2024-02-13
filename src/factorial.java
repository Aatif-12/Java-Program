//Normal Factorial Print

import java.util.Scanner;

public class factorial {
    public static void facto(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial " + " is " + fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();
        facto(n);

    }
}

// Range Factorial Print Eg 5 to 10 only factorial print
// import java.util.Scanner;

// public class factorial {

// public static void factorial1(int Start, int End) {
// int fact = 1;
// for (int i = Start; i <= End; i++) {
// fact = fact * i;
// int ans = fact;
// System.out.println("The factorial of " + i + " is: " + ans);
// }
// }

// public static void CalculateInRanage(int Start, int End) {
// if (Start > End || Start == 0) {
// System.out.println("You have Enter INVALID Range");
// } else {
// factorial1(Start, End);

// }
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the Start Number : "); // 2
// int Start = sc.nextInt();
// System.out.print("Enter the End Number : "); // 5
// int End = sc.nextInt();
// sc.close();
// CalculateInRanage(Start, End);
// }
// }