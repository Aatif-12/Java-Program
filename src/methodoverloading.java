import java.util.Scanner;

public class methodoverloading {
    public static int Sum(int i, int j) {
        System.out.println("1st");
        return (i + j);
    }

    public static int Sum(int i, int j, int k) {
        System.out.println("2nd");
        return (i + j + k);
    }

    public static double Sum(int i, int j, float k) {
        System.out.println("3rd");
        return (i + j + k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 5;
        int j = 7;
        float k = 4.2f;
        System.out.println((int) Sum(i, j, k));
        sc.close();
        System.out.println(Sum(i, j));
        System.out.println(Sum(i, j, k));

    }
}
