package DSAInterviewCourse.video.v08_first_JavaProgram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();

        float num1 = input.nextInt();
        float num2 = input.nextInt();

        float sum = num1 + num2;
        System.out.println("The sum of two values: " + sum);

    }
}
