package DSAInterviewCourse.LeetCode;

import java.util.Arrays;
import java.util.OptionalInt;

public class SpecialArray1608 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,6,5,6,7,8,9};
        System.out.println(">>>>> " + specialArray(arr));

    }

    public static int specialArray(int[] nums) {

        for(int x = 0; x <= 1000 ; x++){
            int numCount = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] >= x){
                    numCount++;
                }
            }
            if(x == numCount){
                return x;
            }
        }
        return -1;
    }
}
