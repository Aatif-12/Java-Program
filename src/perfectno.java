import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        sc.close();
        int ans = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                ans = ans + i;
            }
        }
        if (num == ans) {
            System.out.println("It is a Perfect Number");
        } else {
            System.out.println("It is Not a Perfect Number");
        }
    }

}
