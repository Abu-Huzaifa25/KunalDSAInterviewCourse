package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_02 {
    public static void main(String[] args) {
        // Area Of Triangle
        //

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height :");
        int height = scanner.nextInt();

        System.out.print("Enter base :");
        int base = scanner.nextInt();

        float area = 1 *( base * height)/ 2;
        System.out.println("Area of Triangle : " + area);

    }
}
