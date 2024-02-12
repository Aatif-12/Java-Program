// package Array;

// import java.util.Scanner;

// public class ArrayCC {

// public static void main(String[] args) {
// int marks[] = new int[100];
// Scanner sc = new Scanner(System.in);

// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();
// sc.close();

// System.out.println("Physics = " + marks[0]);
// System.out.println("Maths = " + marks[1]);
// System.out.println("Biology = " + marks[2]);

// System.out.println(marks.length);

// }
// }

package Array;

public class ArrayCC {

    public static void update(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 90 };
        update(marks);

        // print our marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}