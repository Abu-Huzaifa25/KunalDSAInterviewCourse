package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        // Volume Of Prism
        // Formula : V = Base Area × Height
        // The base area depends on the shape of the base (e.g., for a rectangular prism,



        System.out.println("Calculating of the Volume Of Prism");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base Area of the Prism a");
        int a = scanner.nextInt();

        System.out.print("Enter the height of the prism h: :  ");
        int h = scanner.nextInt();


        double v  = a * h;
        System.out.println("Area Volume Of Prism : " + v);

    }
}
