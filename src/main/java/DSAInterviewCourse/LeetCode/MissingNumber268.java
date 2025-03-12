package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class MissingNumber268 {
    public static void main(String[] args) {
        int [] arr = {3,0,1};
        System.out.println(Arrays.toString(sort(arr)));

        System.out.println("------------------- >>>.  ----------- ");

        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int[] nums) {

        int [] arr = sort(nums);
        int n = arr.length;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] != i) {
                return i ;
            }
        }
        return n + 1;
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
}
