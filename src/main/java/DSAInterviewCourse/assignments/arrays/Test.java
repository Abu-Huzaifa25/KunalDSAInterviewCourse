package DSAInterviewCourse.assignments.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

//        System.out.println(Arrays.toString(getIndex(arr, 2)));
//        printColumns(arr,0);

        int [] colors = {2,0,2,1,1,0};
        sortColors(colors);

    }

    static void sortColors(int [] nums){
        int temp = nums[0];
        int [] arr = new int[nums.length];
        for (int i =0; i < nums.length; i++){


        }
        System.out.println(Arrays.toString(nums));
    }

    public static void printColumns(int[][] arr , int colIndex){
        for ( int i = 0 ; i < arr.length ; i++){
            // i =0
            System.out.println(arr[i][colIndex]);
        }
    }


//    static int[] getIndex(int [][] arr , int indexA){
//
//        int[] column = new int[arr.length];
//        for (int i = 0; i < arr.length; i++){
//            column[i] = arr[i][indexA];
//            return column;
//        }
//        return new int[]{-1};
//    }

}
