package DSAInterviewCourse.assignments.arrays;

import java.util.Arrays;

public class eg_10SumTwoNumber {
    public static void main(String[] args) {
//        int[] arr = { 2,7,11,15 };
        int[] arr = { 11,2,4,5,6,7,8 };

        int num = 9;

        System.out.println(Arrays.toString(twoSum(arr, num)));

    }

    static  int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }
}
