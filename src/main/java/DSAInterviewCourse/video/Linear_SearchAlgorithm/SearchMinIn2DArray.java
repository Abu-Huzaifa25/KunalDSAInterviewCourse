package DSAInterviewCourse.video.Linear_SearchAlgorithm;

import java.util.Arrays;

public class SearchMinIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
                {49,55,77,88,99},
                {45,67,88,9},
                {33,6,7,8,90,23,4},
                {99,56,77,88,34, 123},
        };
        int[] ans = searchMin(arr);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] searchMin(int[][] arr) {
        int min = arr[0][0];
        int[] minIndex = {-1, -1};
        for (int i = 1; i < arr.length; i++){
            for (int j = 1; j < arr[i].length; j++){
                if ( arr[i][j] < min ){
                    min = arr[i][j];
                    minIndex = new int[]{i, j};
                }
            }
        }
        return minIndex;
    }
}
