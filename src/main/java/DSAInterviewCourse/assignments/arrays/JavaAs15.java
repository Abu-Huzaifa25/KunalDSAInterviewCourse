package DSAInterviewCourse.assignments.arrays;

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

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j ) sum += mat[i][j];

                if (i + j == n - 1 && i != j) {
                    sum += mat[i][j];
                }

            }

        }



        return sum;
    }


}
