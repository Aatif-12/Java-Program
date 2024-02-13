import java.util.Scanner;

public class samevaluefind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        samevalue(num1, num2);

    }

    public static void samevalue(int num1, int num2) {

        for (int i = 1; i <= num1 && i <= num2; i++) {
            int GCD = 0;
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(i);
                GCD = i;
            }
        }
    }
}
