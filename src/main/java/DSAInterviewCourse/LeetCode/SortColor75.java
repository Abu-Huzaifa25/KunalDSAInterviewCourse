package DSAInterviewCourse.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

class SortColor75 {

    public static void main(String[] args) {

        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));


    }


    public static void sortColors(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len-1; i++){
            for (int j = 0; j < len - i -1; j++){
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j+ 1];
                    nums[j+1] = temp;

                }
            }

        }


        
        
    }
}