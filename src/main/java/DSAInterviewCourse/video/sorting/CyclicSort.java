package DSAInterviewCourse.video.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length){
            int correctIndex = arr[i] -1 ; // n - 1;  [ 0 - n ]
            if (arr[i] != arr[correctIndex]){
                // swap indexes
//                int temp = arr[i];
//                arr[i] = arr[correctIndex];
//                arr[correctIndex] = temp;
                // Or swap Method call
                swap(arr, i, correctIndex);

            }else {
                i++;
            }
        }
    }

    public static void swap(int [] arr, int first, int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
