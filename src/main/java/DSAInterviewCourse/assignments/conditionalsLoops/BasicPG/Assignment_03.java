package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_03 {
    public static void main(String[] args) {
        // Area Of Rectangle Program

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length :");
        int length = scanner.nextInt();

        System.out.print("Enter width :");
        int width = scanner.nextInt();

        float area = length * width;
        System.out.println("Area of Rectangle : " + area);

    }
}
