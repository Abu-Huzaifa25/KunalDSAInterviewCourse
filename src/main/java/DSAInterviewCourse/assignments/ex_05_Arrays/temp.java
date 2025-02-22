package DSAInterviewCourse.assignments.ex_05_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Math.abs;

public class temp {
    public static void main(String[] args) {

    }

//    public static boolean isPalindrome(int x) {
//
//
//        int num = Math.abs(x);
//        int original = num;
//        int sum = 0;
//        while ( num != 0){
//            int rem = num % 10 ;
//            sum = sum * 10 + rem;
//            num = num / 10;
//        }
//        return sum == original;
//
//    }

    public static int[] twoSum(int[] nums, int target) {

        int [] arr =  new int [2];

//        HashMap<Integer, Integer> map = new HashMap<>(nums.length);

        int sum = 0;


        for (int i = 0; i < nums.length; i++){
            int n = target - nums[i];
//            if (map.containsKey(n)){
//                return new int []{map.get(n) ,i};
//            }
//
//            map.put(i, nums[i]);

        }
        return new int[]{}; // No solution found



    }




}
