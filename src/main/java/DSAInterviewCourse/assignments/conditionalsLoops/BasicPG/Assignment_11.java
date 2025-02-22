package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        // 11.  Perimeter Of Rectangle

        System.out.println("Program of the Perimeter Of Rectangle:\n" +
                "where l = l is the length of the rectangle and w is the width of the rectangle. " +
                "and P is the parameter of the Shape");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length ( l ) : ");
        int l = scanner.nextInt();

        System.out.print("Enter the width ( w ) : ");
        int w = scanner.nextInt();

        double p  = 2 * ( l + w );
        System.out.println("Area Perimeter Of Rectangle : " + p);

    }
}
