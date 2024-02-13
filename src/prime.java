
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Number is Not Prime");
                return;
            }
        }
        System.out.println("Number is Prime");
    }
}
