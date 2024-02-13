import java.util.Scanner;

public class nCr {
    public static int BinomialCoefficient(int n, int r) {
        int n_fact = (factorial(n));
        int r_fact = (factorial(r));
        int sub = (factorial(n - r));
        int nCr = n_fact / (r_fact * sub);
        return nCr;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        System.out.println(BinomialCoefficient(n, r));

    }
}