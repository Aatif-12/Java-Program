public class alphabet3 {
    public static void main(String args[]) {
        int n = 5;
        char startchar = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(Character.toLowerCase(startchar) + " ");

                } else {
                    System.out.print(startchar + " ");
                }
                startchar++;
            }
            System.out.println();
        }
    }
}
