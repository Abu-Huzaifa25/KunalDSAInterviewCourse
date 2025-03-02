package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent1365 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }


    static int[] smallerNumbersThanCurrent(int [] nums){

        int[] smNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if  ( nums[i] > nums[j] && i != j){
                    smNums[i]++;
                }
            }
        }
        return smNums;
    }
}
