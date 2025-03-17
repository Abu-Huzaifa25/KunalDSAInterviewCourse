package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class TestCases {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,1,4};//
//        int target = 3;
//        System.out.println(Arrays.toString( searchRange(nums, 3)));
    }



//    public static int [] searchRange(int [] nums, int target){
//
//        if (nums.length == 0 || nums[0] > target || nums[nums.length-1] < target){
//            return new int[]{-1, -1};
//        }
//        int firstIndex = firstOccurrence(nums, target);
//        int lastIndex = lastOccurrence(nums, target);
//        return new int[]{firstIndex, lastIndex};
//    }
//
//    public static int firstOccurrence(int [] nums, int target){
//        int start = 0,end = nums.length-1;
//
//        while (start <= end ){
//            int mid = start + ( end - start) / 2;
//            if ( nums[mid] > target ){
//               end = mid - 1;
//            } else if (nums[mid] < target ) {
//                start = mid + 1;
//            }else {
//                end = mid - 1;
//            }
//        }
//        if (nums[start] == target ){
//            return start;
//        }else {
//            return -1;
//        }
//
//    }
//
//
//    public static int lastOccurrence(int [] nums, int target){
//        int start = 0,end = nums.length-1;
//        while (start <= end ){
//            int mid = start + ( end - start) / 2;
//            if ( nums[mid] > target ){
//                end = mid - 1;
//            } else if (nums[mid] < target ) {
//                start = mid + 1;
//            }else {
//                start = mid + 1;
//            }
//        }
//        if (nums[end] == target ){
//            return end;
//        }else {
//            return -1;
//        }
//
//    }








}
