import java.util.Scanner;

public class square {
    public static void power(int num, int pow) {
        int square = 1;
        for (int i = 0; i < pow; i++) {
            square = square * num;
        }
        System.out.println(square);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 2
        int pow = sc.nextInt(); // 3
        sc.close();
        power(num, pow);
    }
}
