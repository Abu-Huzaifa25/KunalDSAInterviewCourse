package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastPosition34 {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};//
        int target = 6;
        System.out.println(Arrays.toString( searchRange(nums, target)));
    }


    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums[0] > target || nums[nums.length - 1] < target ) {
            return new int[]{-1, -1};
        }
        int firstIndex = findFirstOccurance(nums, target);
        int lastIndex = findLastOccurance(nums, target);
        return new int[]{firstIndex, lastIndex};
    }

    public static int findFirstOccurance(int [] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = ( start + end ) / 2;
            if(nums[mid] > target ){
                end = mid - 1;
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                // target found
                end = mid - 1;
            }
        }
        return start;
    }
    public static int findLastOccurance(int [] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = ( start + end ) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            } else if (nums[mid] < target){
                start = mid + 1;
            } else {
                // target found
                start = mid + 1;
            }

        }
        return end;
    }

}
