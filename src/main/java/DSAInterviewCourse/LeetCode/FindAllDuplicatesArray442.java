package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.List;


public class FindAllDuplicatesArray442 {

    // 442. Find All Duplicates in an Array
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> arr = findDuplicates(nums);
        System.out.println(arr);
    }

    public static List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i < nums.length){
            int  correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                // Swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                list.add(nums[index]);
            }
        }
        return list;

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
