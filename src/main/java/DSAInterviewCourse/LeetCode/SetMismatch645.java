package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class SetMismatch645 {
    public static void main(String[] args) {

        int [] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }
    public static int[] findErrorNums(int[] nums) {

        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] -1;
            if (nums[i] != nums[correctIndex]){
                // Swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else i++;
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1,-1};


    }
}
