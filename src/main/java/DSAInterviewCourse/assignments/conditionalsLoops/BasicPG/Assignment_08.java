package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_08 {
    public static void main(String[] args) {
        // Perimeter Of Circle C=2πr

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius ( r ) :");
        int r = scanner.nextInt();
        float pi = 3.14159265359f;


        double c = 2 * pi * r;
        System.out.println("Area of Perimeter Of Circle : " + c);

    }
}
