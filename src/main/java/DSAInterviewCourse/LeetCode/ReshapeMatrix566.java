package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class ReshapeMatrix566 {
    public static void main(String[] args) {

        int[][] dArr = {
                {1, 2},
                {3, 4}
        };
        int r =1, c = 4;

        System.out.println(Arrays.deepToString(matrixReshape(dArr, r, c)));

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int [][] reshapeMatrix = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;


        if (row * col != r * c){
            return mat;
        }






        return reshapeMatrix;

    }
}
