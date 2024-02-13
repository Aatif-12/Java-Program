import java.util.Scanner;

public class armstrong {
    public static int Cube(int remainder) {
        int pow = 3;
        int cubeofnumber = 0;
        cubeofnumber = cubeofnumber + (int) Math.pow(remainder, pow);
        return cubeofnumber;
    }

    public static void ArmStrongNumber(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int remainder = n % 10;
            rev = rev + Cube(remainder);
            n = n / 10;
        }
        if (rev == temp) {
            System.out.println(rev + " is a ArmStrong Number");
        } else {
            System.out.println(rev + " is not a ArmStrong Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArmStrongNumber(n);
        sc.close();
    }
}
