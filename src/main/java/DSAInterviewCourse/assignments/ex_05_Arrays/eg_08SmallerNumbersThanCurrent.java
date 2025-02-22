package DSAInterviewCourse.assignments.ex_05_Arrays;

import java.util.Arrays;

public class eg_08SmallerNumbersThanCurrent {
    // Question Link ==>>
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/


    public static void main(String[] args) {

        int[] arr = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }


    public static int[] smallerNumbersThanCurrent(int [] nums ){

        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
               if (nums[j] < nums[i] && j != i){
                   newArr[i]++;
               }
            }
        }
        return newArr;

    }
}
