package DSAInterviewCourse.assignments.ex_04_Functions;

import java.util.Scanner;

public class ex_04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = in.nextInt();
        System.out.print("Enter number :");
        int m = in.nextInt();
        System.out.println("The sum is : " + isSum(m, n));



    }

    public static int isSum(int a, int b){

       return a + b;

    }
}
