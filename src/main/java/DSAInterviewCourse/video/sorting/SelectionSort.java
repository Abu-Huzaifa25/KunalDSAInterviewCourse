package DSAInterviewCourse.video.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3,5,2,6,7,1,8};
        selectionSortIIndMethod(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++ ){
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex( nums, 0, last);
            swap(nums, maxIndex, last);
        }
    }
    public static void swap ( int [] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    private static int getMaxIndex ( int [] nums, int start, int end){
        int  max = start;
        for (int i = 0; i < end; i++){
            if (nums[max] <= nums[i]){
                max = i;
            }
        }
        return max;
    }

    public static void selectionSortIIndMethod(int [] nums){

        int len = nums.length;
        for (int i = 0; i < len -1; i++){
            int minIndex = i;

            for (int j = i + 1; j < len; j++){
                if (nums[j] <  nums[minIndex]){
                    minIndex = j;
                }

            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }
    }


}
