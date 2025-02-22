package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        // 10.  Perimeter Of Parallelogram

        System.out.println("Program of thePerimeter Of Parallelogram ");
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the length of one pair of opposite sides : a ");
        int a = scanner.nextInt();

        System.out.print(" Enter the length of the other pair of opposite sides : b ");
        int b = scanner.nextInt();

        double p  = 2 * ( a + b );
        System.out.println("Area Perimeter Of Parallelogram : " + p);

    }
}
