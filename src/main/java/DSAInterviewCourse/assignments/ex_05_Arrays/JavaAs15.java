package DSAInterviewCourse.assignments.ex_05_Arrays;

import java.util.Arrays;

public class JavaAs15 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(diagonalSum(arr));
    }

    static int diagonalSum(int[][] mat) {



        int sunDiagonal = 0;

        for (int i = 0; i < mat.length; i++){
            for (int j = i; j < i; j++){

                sunDiagonal = mat[i][i];

            }
        }

        return sunDiagonal;
    }


}
