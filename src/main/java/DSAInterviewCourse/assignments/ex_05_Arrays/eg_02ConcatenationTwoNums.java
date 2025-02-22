package DSAInterviewCourse.assignments.ex_05_Arrays;

import java.util.Arrays;

public class eg_02ConcatenationTwoNums {
    /*

        Given an integer array nums of length n, you want to create an array ans of length 2n where
        ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

        -> Specifically, ans is the concatenation of two nums arrays.
        Return the array ans.

        Example 1:
        Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]

        Link -> https://leetcode.com/problems/concatenation-of-array/description/


     */
    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
//        System.out.println(Arrays.toString(getConcatenation2nd(nums)));

        // output -> [1,3,2,1,1,3,2,1]
    }



    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int [] ans = new int[n*2];

        for (int i = 0; i < n; i++){  // With single loop
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static int [] getConcatenation2nd(int[] nums){ // with double loop
        int [] ans = new int[nums.length*2];
        int index = 0;
        for (int i =0; i<2; i++){
            for (int num : nums){
                ans[index++] = num;
            }
        }
        return ans;
    }
}
