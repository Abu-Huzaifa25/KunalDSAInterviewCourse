package DSAInterviewCourse.assignments.arrays;

import java.util.Arrays;

public class eg_05ShuffleArray {
    /*
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    link ==> https://leetcode.com/problems/shuffle-the-array/description/

    Input: nums = [2,5,1,3,4,7], target n = 3
    Output: [2,3,5,4,1,7]
     */
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 4, 7}; // [2,3,5,4,1,7]
        int targetElement = 3;
        System.out.println(Arrays.toString(shuffle(arr, targetElement) ));

    }

    public static int[] shuffle(int[] nums, int n) {

//        int[] m = new int[nums.length];
//        for (int i = 0; i < nums.length ; i++){
//            m[i] = nums[i];
//
//        }
//        for (int i = n-1 ; i < nums.length; i++){
//            m[ i] = nums[i];
//        }
//        return m;


        int [] output = new int [nums.length];
        int x = 0;
        int y = n;
        int index = 0;
        while ( index < nums.length ){
            output[index] = nums[x];
            index++;
            output[index] = nums[y];
            index++;
            x++;
            y++;
        }
        return output;


    }
}
