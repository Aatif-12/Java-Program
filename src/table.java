import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        sc.close();
        multiply(num);
    }

    public static void multiply(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}