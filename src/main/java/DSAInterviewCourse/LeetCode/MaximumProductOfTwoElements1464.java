package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class MaximumProductOfTwoElements1464 {
    public static void main(String[] args) {

        System.out.println(maxProduct(new int[]{3,7}));
    }

//    public static int maxProduct(int[] nums) {
//
//        int firstNumber = 0;
//        int secondNumber = 0;
//
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] > firstNumber){
//                secondNumber = firstNumber;
//                firstNumber = nums[i];
//            }else if (nums[i] > secondNumber){
//                secondNumber = nums[i];
//            }
//        }
//        return (firstNumber -1) * (secondNumber - 1);
//    }

    public static int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int pro=(nums[n-1]-1)*(nums[n-2]-1);
        return pro;
    }
}
