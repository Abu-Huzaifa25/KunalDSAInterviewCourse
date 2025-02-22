package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        // 12.  Perimeter of a Square
        // Formula: P = 4a ->  Where a is the length of one side .

        System.out.println("Calculating of the Perimeter of a Square ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area of the length of one side a: ");
        int a = scanner.nextInt();

        double p  = 4 * a;
        System.out.println("Area  Perimeter of a Square : " + p);

    }
}
