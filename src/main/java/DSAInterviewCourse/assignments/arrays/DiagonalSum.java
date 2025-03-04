package DSAInterviewCourse.assignments.arrays;

public class DiagonalSum {
    public static void main(String[] args) {

        int[][] arr = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
//        System.out.println(getSum(arr));
        print(arr);

    }

    public static int getSum(int [][] nums){

        int sum = 0;
        int len = nums.length;


        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i == j) sum = nums[i][j];
            }
        }
        return sum;
    }

    // ----------- Reverse Print Diagonal -----------
    public static void print(int [][] nums){
        int len = nums.length-1;
        for (int i = len; i >= 0; i--){
            for (int j = len; j >= 0; j--){
                if (i == j) System.out.println(nums[i][j]);
            }
        }
    }


}
