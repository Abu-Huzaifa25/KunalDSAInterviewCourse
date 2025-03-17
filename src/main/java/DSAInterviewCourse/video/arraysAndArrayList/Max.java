package DSAInterviewCourse.video.arraysAndArrayList;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {

        int[] arr = {13, 2,9, 3, 1,3,4,5,6, 9};

//        maxNum(arr);
//        System.out.println(maxNum(arr));
//        System.out.println(maxNuminRnge(arr, 0,5));
        System.out.println(Arrays.toString(arr));
    }


    static int maxNum(int[] arr ){
        int max = arr[0];
        for (int i = 0; i <= arr.length -1; i++){
            if (max < arr[i]){
                max = arr[i];
            };
        }
        return max;
    }

    static int maxNuminRnge(int[] arr, int start, int end){
        int max = arr[start];
        for (int i = start; i < end; i++ ){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }




}
