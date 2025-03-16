package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

import static DSAInterviewCourse.video.sorting.CyclicSort.swap;

public class MissingNumber268 {
    public static void main(String[] args) {
        int [] arr = {3,0,1};
        System.out.println(missingNumber2ndM(arr));

    }

    // Method 1st start
    public static int missingNumber(int[] nums) {

        int [] arr = sort(nums);
        int n = arr.length;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != i) {
                return i ;
            }
        }
        return  n;
    }
    public static int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
    // Method 1st end


    // Method 2nd start

    public static int missingNumber2ndM(int[] nums) {


        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else i++;
        }

        // search first missing number
        for (int index= 0; index < nums.length; index++){
            if (nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }

}
