package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Try {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 7, 8},
                {9, 11, 13},
                {19, 16, 17}
        };

        System.out.println(luckyNumber(arr));
    }


    public static List<Integer> luckyNumber(int [][] matrix){
        List<Integer> lucky = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++){
            int [] arr = matrix[i];
            int minIdx = minNumbers(arr);

            boolean isLucky = maxNumber(matrix, minIdx, i);
            if (isLucky){
                lucky.add(matrix[i][minIdx]);
                return lucky;
            }
        }
        return lucky;
    }

    public static boolean maxNumber(int [][] matrix , int minIndex, int row){
        int max = matrix[row][minIndex];
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][minIndex] > max){
                return false;
            }
        }
        return true;
    }


    public static int minNumbers(int [] arr ){
        int min = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
