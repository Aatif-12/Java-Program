import java.util.*;

public class fibonacci {

    public static void fibonacciSeries(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= num; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        fibonacciSeries(num);

    }
}
