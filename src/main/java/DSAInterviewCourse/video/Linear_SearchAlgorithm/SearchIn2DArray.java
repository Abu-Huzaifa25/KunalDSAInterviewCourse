package DSAInterviewCourse.video.Linear_SearchAlgorithm;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int [][] arr = {
                {44,55,77,88,99},
                {45,67,88,9},
                {33,6,7,8,90,23,4},
                {5,56,77,88,34},
        };

        int[] ans = search(arr, 987);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int [][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
