package DSAInterviewCourse.video.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // Bubble sort How to work
        int[] nums = {7, 2, 3, -17, -27, 3, 7, 49, 4, 5, 6};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));



    }


    public static void bubbleSort(int [] nums){

        int len = nums.length;
        for (int i = 0; i < len - 1; i++ ){
            for (int j = 0; j < len - i - 1; j++ ){
                if  (nums[j] > nums[j + 1]){
                    int temp = nums[j]; // index value of Zero ->
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }
    }
}

