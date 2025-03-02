package DSAInterviewCourse.assignments.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaAs13 {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };


        System.out.println(Arrays.deepToString((flipAndInvertImage(arr))));

    }

    static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i< image.length; i++){
            for (int j = 0; j < image[i].length/2; j++){
                int temp = image[i][j];

//                image[i][j] == image[i][image.length-j-1]


            }
        }
        return  image;
    }



}
