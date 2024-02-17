public class basic {

    static {
        System.out.println("This is first");
    }

    public static void printNumbers(int nums) {
        int sum = 0;
        for (int i = 0; i <= nums; i++) {
            System.out.print(i + " ");
            sum = sum + i;

        }
        System.out.println();
        System.out.println("Sum of Numbers :" + sum);
    }

    public static void main(String[] args) {

        System.out.println("this is main");

    }

    static {
        int nums = 10;
        printNumbers(nums);
    }
}
