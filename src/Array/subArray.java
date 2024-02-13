package Array;

// Sub Array like {2} {2,4} {2,4,6} {2,4,6,8} .......
// public class subArray {

// public static void SubArrays(int nums[]) {
// int total = 0;
// for (int i = 0; i < nums.length; i++) {

// int start = i;
// for (int j = i; j < nums.length; j++) {
// int end = j;
// for (int k = start; k <= end; k++) {
// System.out.print(nums[k] + " ");
// }

// total++;
// System.out.println();
// }
// System.out.println();
// }
// System.out.println("Total subArrays : " + total);
// }

// public static void main(String[] args) {
// int nums[] = { 2, 4, 6, 8, 10 };
// SubArrays(nums);
// }
// }

public class subArray {

    public static void maxSubArray(int nums[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + nums[k];
                }
                System.out.println(currSum);
                if (max < currSum) {
                    max = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum is " + max);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, -2, 1, 7, -3 };
        maxSubArray(nums);
    }
}