package DSAInterviewCourse.video.v12_arraysAndArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

//        swap(arr, 0,7);
//        System.out.println(Arrays.toString(arr));

        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    static void reverseArr(int[] arr){
        int start = 0 ;
        int end = arr.length -1;
        while (start < end){
            // calling swap method
            swap(arr, start,end);
            start++;
            end--;
        }
    }
}
