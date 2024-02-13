// import java.util.Scanner;

// public class strong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt(); // 145
//         int temp = num;
//         sc.close();
//         int sum = 0;
//         while (num != 0) {
//             int lastdigit = num % 10; // 5
//             sum = sum + fact(lastdigit);
//             num = num / 10;
//         }
//         if (temp == sum) {
//             System.out.println("It's Strong Number");
//         } else {
//             System.out.println("It's not Strong Number");
//         }
//     }

//     public static int fact(int lastdigit) {

//         int fact = 1;
//         for (int i = 1; i <= lastdigit; i++) {
//             fact = fact * i;

//         }
//         return fact;

//     }
// }

import java.util.Scanner;

public class strong {

    public static int fact(int lastdigit) {

        int fact = 1;
        for (int i = 1; i <= lastdigit; i++) {
            fact = fact * i;

        }
        return fact;

    }

    public static void FoundStrongNumber(int start, int end) {
        boolean foundStrongNo = false;
        if (start > end) {
            System.out.println("You are Enter INVALID Range");
        }
        for (int i = start; i <= end; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                int lastdigit = number % 10; // 5
                sum = sum + fact(lastdigit);
                number = number / 10;
            }
            if (i == sum) {
                System.out.println("The Strong Number is " + start + " to " + end + " = " + i);
                foundStrongNo = true;
            }

        }
        if (!foundStrongNo) {
            System.out.println("There are no Strong Number in Given Range");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        FoundStrongNumber(start, end);
    }
}
