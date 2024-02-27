import java.util.Scanner;

public class methodoverloading {
    public static int Sum(int i, int j) {
        return (int) (i + j);
    }

    public static int Sum(int i, int j, int k) {
        return (i + j + k);
    }

    public static double Sum(int i, int j, float k) {
        return (i + j + k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 5;
        int j = 7;
        float k = 4;
        Sum(5,7,4);
        sc.close();
    }
}
