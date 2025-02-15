package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.BasicPG;

import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        // 13.  Perimeter of a Rhombus
        // Formula: P = 4a ->  Where is the length of one side (all sides are equal in a rhombus) .

        System.out.println("Calculating of the Perimeter of a Rhombus ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a area :  Where a is the length of one side (all sides are equal in a rhombus). ");
        int a = scanner.nextInt();

        double p  = 4 * a;
        System.out.println("Area Perimeter of a Rhombus : " + p);

    }
}
