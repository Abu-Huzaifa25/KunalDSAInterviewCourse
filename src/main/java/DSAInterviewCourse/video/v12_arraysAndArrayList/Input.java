package DSAInterviewCourse.video.v12_arraysAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        int [] arr = new int[5];

//        for (int i = 0; i < arr.length; i++){
//            arr[i] = scanner.nextInt();
//        }

//        for (int i = 0; i <= arr.length; i++){
//            System.out.print(arr[i] + ", ");
//        }

//        System.out.println(Arrays.toString(arr));


        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.next();
        }

        System.out.println(Arrays.toString(arr));
    }
}
