package DSAInterviewCourse.video.v15_binarySearchAlgorithmInterviewQuest;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,15,20,25},
                {12,22,23,29},
                {30,45,46,47},
                {35,53,54,55},
                {67,89,99,101}
        };

        System.out.println(Arrays.toString(search(arr, 55)));

    }

    static int[] search(int [][] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;

        while (r < matrix.length && c >= 0){

            if (matrix[r][c] == target) {
                return new int[]{r, c}; // Return the indices if the target is found
            }
            if (matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1,-1};

    }
}
