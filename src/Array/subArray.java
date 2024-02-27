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

// public class subArray {

//     public static void maxSubArray(int nums[]) {
//         int currSum = 0;
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < nums.length; i++) {
//             int start = i;
//             for (int j = i; j < nums.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for (int k = start; k <= end; k++) {
//                     currSum = currSum + nums[k];
//                 }
//                 System.out.println(currSum);
//                 if (max < currSum) {
//                     max = currSum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Max sum is " + max);
//     }

//     public static void main(String[] args) {
//         int nums[] = { 2, 4, -2, 1, 7, -3 };
//         maxSubArray(nums);
//     }
// }

/**
 * subArray
 */
public class subArray {

    public static void maxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum = " + maxSum);
    }

    public static void main(String[] args) {

    }
}