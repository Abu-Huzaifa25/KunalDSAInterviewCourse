package DSAInterviewCourse.assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5};
        rotate(array,3);
        System.out.println(Arrays.toString(array));
    }


    public static void rotate(int[] nums, int k) {
        int []outputArray = new int [nums.length];
        outputArray[0] = nums[nums.length -1];
        for(int j=1;j<=k;j++) {
            for (int i = 1; i < nums.length - 1; i++) {
                outputArray[i] = nums[i - 1];
            }
        }
        System.out.println(" >>> "+Arrays.toString(nums) );
        nums = outputArray;
        System.out.println(" <<< "+Arrays.toString(nums));
    }
}
