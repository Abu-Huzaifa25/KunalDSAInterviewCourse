package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {


        int len = nums.length;
        HashSet<Integer> isDuplicate = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
           if (isDuplicate.contains(nums[i])){
               return true;
           }
           isDuplicate.add(nums[i]);
        }

        return false;

    }
}
