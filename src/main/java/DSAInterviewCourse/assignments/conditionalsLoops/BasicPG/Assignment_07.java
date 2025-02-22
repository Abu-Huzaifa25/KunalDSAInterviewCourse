package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_07 {
    public static void main(String[] args) {
        // Area Of Equilateral Triangle  A= 3*3/4  a*2

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side ( A ) :");
        int a = scanner.nextInt();

        double area = (Math.sqrt(3) / 4) * Math.pow(a, 2);
        System.out.println("Area of Equilateral Triangle : " + area);

    }
}
