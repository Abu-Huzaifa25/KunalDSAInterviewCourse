package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.BasicPG;

import java.util.Scanner;

public class Assignment_05 {
    public static void main(String[] args) {
        // Area Of Parallelogram

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height :");
        int height = scanner.nextInt();

        System.out.print("Enter base :");
        int base = scanner.nextInt();

        float area = base * height;
        System.out.println("Area of Parallelogram : " + area);

    }
}
