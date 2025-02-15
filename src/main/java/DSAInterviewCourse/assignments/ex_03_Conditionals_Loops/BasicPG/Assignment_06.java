package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.BasicPG;

import java.util.Scanner;

public class Assignment_06 {
    public static void main(String[] args) {
        // Area Of Rhombus

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Diagonal ( p ) :");
        int p = scanner.nextInt();

        System.out.print("Enter Diagonal ( q ) :");
        int q = scanner.nextInt();

        float area = p * q / 2;
        System.out.println("Area of Rhombus : " + area);

    }
}
