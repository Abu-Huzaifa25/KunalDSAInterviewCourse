package DSAInterviewCourse.video.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {4,5,6,-7,-9,8,};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void insertionSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i + 1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j - 1);
                }else break;
            }
        }
    }

    static void swap(int [] arr, int start, int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;
    }

}
