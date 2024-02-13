// import java.util.Scanner;

// public class swap {

//     public static void swaping(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println(a);
//         System.out.println(b);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         sc.close();
//         swaping(a, b);

//     }
// }

import java.util.Scanner;

public class swap {

    public static void swaping(int a, int b) {
        a = a + b; // a = a * b pr 0 liye to sb 0 honga
        b = a - b; // a = a / b
        a = a - b; // a = a / b
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 10
        int b = sc.nextInt(); // 5
        sc.close();
        swaping(a, b);

    }
}
