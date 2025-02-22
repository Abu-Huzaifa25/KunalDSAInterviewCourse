package DSAInterviewCourse.assignments.arrays;

import java.util.Arrays;

public class eg_03RunningSum1DArr {
    public static void main(String[] args) {
        /*
            03. Running Sum of 1d Array
            Input: nums = [1,2,3,4]
            Output: [1,3,6,10]
            Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
            Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

         */

        int [] nums = { 1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));




    }

    public static int [] runningSum(int [] nums){
        int [] newArr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            newArr[i] = sum;
        }
        return newArr;
    }
}
