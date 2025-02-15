package DSAInterviewCourse.video.v12_arraysAndArrayList;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {

        int[] arr = {1, 2, 35, 6, 3, 6, 7};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] arr) {
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
    }
}