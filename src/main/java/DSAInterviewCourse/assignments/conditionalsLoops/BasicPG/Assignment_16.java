package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] args) {
        // Volume Of Cylinder
        // Formula : V = π r * r * h
        // Where r is the radius of the base and is the height.

        System.out.println("Calculating of the Volume Of Cylinder");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the base r: ");
        int r = scanner.nextInt();

        System.out.print("Enter the height of the Cylinder h: :  ");
        int h = scanner.nextInt();

        float pi = 3.14159f;
        double v  = 0;

        v = pi * r*r * h;
        System.out.println("Area Volume Of Cylinder: " + v);

    }
}
