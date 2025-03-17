package DSAInterviewCourse.video.v15_binarySearchAlgorithmInterviewQuest;

import java.sql.Array;
import java.util.Arrays;

public class FindTargetIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {4, 5, 2, 6, 7,},
                {4, 6, 9, 7, 7,},
                {3, 5, 7, 88, 9},
                {45, 7, 89, 0, 3,},
                {3, 4, 5, 67, 89, 0},
        };

        System.out.println(Arrays.deepToString(getTargetIn2DArray(arr, 809)));

//        System.out.println(Arrays.toString(getTargetIn2DArray(arr, 89)));


    }

    static int[][] getTargetIn2DArray(int[][] arr, int target ){
        int start = 0, end = arr.length-1;
        int[][] ans = new  int[1][1];
        for (int i = start; i < arr.length; i++){
            for (int j = start;j < arr[i].length; j++){
                if (arr[i][j] == target){
                    return new int[][]{{i, j}};
                }
            }
        }
        return new int[][]{{-1, -1}};
    }
}
