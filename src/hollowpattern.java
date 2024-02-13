// import java.util.Scanner;

// public class hollowpattern {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row = sc.nextInt();
//         int col = sc.nextInt();
//         sc.close();
//         for (int i = 1; i <= row; i++) {
//             for (int j = 1; j <= col; j++) {

//                 if (i == 1 || j == 1 || i == row || j == col) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

public class hollowpattern {

    public static void hollowptrn(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        hollowptrn(row, col);
    }
}