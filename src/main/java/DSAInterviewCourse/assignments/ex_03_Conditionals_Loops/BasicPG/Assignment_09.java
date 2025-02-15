package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.BasicPG;

import java.util.Scanner;

public class Assignment_09 {
    public static void main(String[] args) {
        // Perimeter Of Equilateral Triangle

        Scanner scanner = new Scanner(System.in);
        System.out.print("Perimeter Of Equilateral Triangle ( Side ( a ) ) :");
        int a = scanner.nextInt();


        double p = 3*a;
        System.out.println("Area Perimeter Of Equilateral Triangle : " + p);

    }
}
