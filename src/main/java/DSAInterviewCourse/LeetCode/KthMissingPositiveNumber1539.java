package DSAInterviewCourse.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class KthMissingPositiveNumber1539 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));




    }

    public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i<=k) k++ ; else break;
        }
        return k;

    }


    //brute force
//    public static int findKthPositive(int[] arr, int k) {
//        int countMissingNumber = 0;
//        int index = 0;
//        for (int i = 1; i <= arr[arr.length - 1] + k; i++) {
//            if(index < arr.length) {
//                if (i != arr[index]) {
//                    countMissingNumber++;
//                } else {
//                    index++;
//                }
//            } else {
//                countMissingNumber++;
//            }
//
//            if (countMissingNumber == k) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
