import java.util.Scanner;

public class palindrome {
    // 121 output 121 its palindrome
    // 145 output not palindromme
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int rev = check(num);
        if (num == rev) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }

    }

    public static int check(int num) {

        int rev = 0;
        while (num > 0) {
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        return rev;
    }

}
