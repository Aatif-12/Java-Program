public class invertendhalfpyramidnumber {
    public static void invertedhalfpyramid(int n) {

        for (int i = 1; i <= n; i++) {
            // int count = 1;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
                // System.out.print(count);
                // count++;

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        invertedhalfpyramid(n);
    }
}