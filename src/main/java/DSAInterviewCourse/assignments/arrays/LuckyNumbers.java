package DSAInterviewCourse.assignments.arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        int[][] arrr = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}
        };
        System.out.println(luckyNumbers(arrr));


    }


    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            int minIndex = findMin(arr);
            boolean isLuckNumber = findMaxInColumns(matrix, minIndex, i);
            if (isLuckNumber){
                 arrayList.add(matrix[i][minIndex]);
                 return arrayList;
            }
        }
        return arrayList;
    }


    static boolean findMaxInColumns(int [][] matrix , int minIndex, int row){
        int maxValue = matrix[row][minIndex];
        for(int i = 0 ; i < matrix.length ; i++){
           if ( matrix[i][minIndex] > maxValue){
               return false;
           }
        }
        return true;
    }


    static int findMin(int[] arr) {
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


}
