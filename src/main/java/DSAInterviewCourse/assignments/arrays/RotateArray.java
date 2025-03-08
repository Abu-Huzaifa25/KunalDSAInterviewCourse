package DSAInterviewCourse.assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.*;

import static java.util.Collections.newSequencedSetFromMap;
import static java.util.Collections.reverse;

public class RotateArray {
    public static void main(String[] args) {

        // Output: [5,6,7,1,2,3,4]
//        int [] array = {1,2,3,4,5,6,7};
//        rotateK_Time(array,3);  //
//        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(new int[1][1]));
    }


//    public static void rotateArr(int[] nums, int k) {
//       for(int i = 1; i <= k ; i++){
//           rotate(nums);
//       }
//    }
//
//    public static void rotate(int[] nums){
//        for(int i = 0;i<nums.length -1;i++){
//            int temp = nums[i];
//            nums[i] = nums[nums.length - 1];
//            nums[nums.length -1] = temp;
//        }
//    }


    public static void rotateK_Time(int [] nums, int k){
        int n = nums.length;
        k %= n; // 3 % 5 = 3 //  rotation time///////////////////

        reverse(nums, 0, nums.length - 1);//  // [ 4,3, 2, 1 }
        // index to last index [ 1,2,3,4,5,6,7 ] -> 1.st [ 7,1,2,3,4,5,6 ] -> 2nd [ 6,7,1,2,3,4,5 ] 3rd [5,7,1,2,3,4 ]
        reverse(nums , 0 , k - 1); // st
        reverse(nums, k, n -1 ); // rotate n - 1 ;
    }

    public static void reverse(int [] nums, int start, int end ){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
