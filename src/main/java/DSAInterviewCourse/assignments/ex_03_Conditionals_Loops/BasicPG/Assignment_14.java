package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.BasicPG;

import java.util.Scanner;

public class Assignment_14 {
    public static void main(String[] args) {
        // Volume of a Cone
        // Formula : V= 1/3 π r*r h
        // Where r is the radius of the base and h is the height.

        System.out.println("Calculating of the Volume of a Cone");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r radius of the base:  ");
        int r = scanner.nextInt();

        System.out.print("Enter h height of the cone :  ");
        int h = scanner.nextInt();

        float pi = 3.14159f;

        double v  = (1 * pi * r * r * h) / 3;
        System.out.println("Area Volume Of Cone Java Program : " + v);

    }
}
