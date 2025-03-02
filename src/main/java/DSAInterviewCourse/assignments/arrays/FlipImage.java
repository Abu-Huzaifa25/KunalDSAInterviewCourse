package DSAInterviewCourse.assignments.arrays;

import java.util.Arrays;

public class FlipImage {

    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}))
        );
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] outputArr = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                image[i][j] = image[i][j] == 1 ? 0 : 1;
            }
        }
        int var = 0;
        for (int j = 0; j < image.length; j++) {
            for (int i = image[j].length - 1; i >= 0; i--) {
                outputArr[j][var] = image[j][i];
                var++;
            }
            var = 0;
        }
        return outputArr;
    }
}
