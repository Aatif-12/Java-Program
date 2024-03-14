import java.util.Scanner;

public class nprime {

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not prime");
                return false;
            }
        }
        System.out.println("Prime");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        isPrime(num);

        for (int i = 0; i < num; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        sc.close();
    }
}
