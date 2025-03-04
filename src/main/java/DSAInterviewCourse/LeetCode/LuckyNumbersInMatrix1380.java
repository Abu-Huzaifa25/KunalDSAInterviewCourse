package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix1380 {
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

        for (int i = 0; i < matrix.length; i++){
            int [] arr = matrix[i];
            int minIndex = findMin(arr);

            boolean isLuckyNumber = findMaxValue(matrix, minIndex, i);
            if (isLuckyNumber){
               arrayList.add(matrix[i][minIndex]);
               return arrayList;
            }
        }
        return arrayList;
    }

    public static boolean findMaxValue(int [][] matrix , int mIndex, int row){
        int max = matrix[row][mIndex];
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][mIndex] > max){
                return false;
            }
        }
        return true;
    }


    public static int findMin (int [] arr){

        int minValue = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue ){
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }
}
