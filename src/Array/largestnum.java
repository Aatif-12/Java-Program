package Array;

public class largestnum {

    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 7, 10, 5, 1 };
        System.out.println("Largest value is " + getlargest(numbers));
    }
}
