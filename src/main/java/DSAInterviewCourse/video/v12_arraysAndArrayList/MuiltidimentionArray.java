package DSAInterviewCourse.video.v12_arraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MuiltidimentionArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int [][] arr2d = new int[3][3];

        for (int row = 0; row < arr2d.length; row++){
            for (int col = 0; col < arr2d[row].length; col++){
                arr2d[row][col] = scanner.nextInt();
            }
        }

//        for (int row = 0; row < arr2d.length; row++){
//            for (int col = 0; col < arr2d[row].length; col++){
//                System.out.print(arr2d[row][col] + " ");
//            }
//            System.out.println();
//        }

        for (int row = 0;  row < arr2d.length; row++){
            System.out.println(Arrays.toString(arr2d[row]));
        }

        for (int [] a : arr2d){
            System.out.println(Arrays.toString(a));
        }





//        int[][] arr2D = {
//                {3, 45, 5, 6},
//                {4, 3, 5, 6},
//                {4, 5, 6, 7}
//        };
//
//        for (int row = 0; row < arr2D.length; row++){
//            for (int col = 0; col < arr2D[row].length; col++){
//                System.out.print(arr2D[row][col] + ", ");
//            }
//            System.out.println();
//        }

//        System.out.println(Arrays.toString(arr2D));


    }
}
