package DSAInterviewCourse.assignments.ex_04_Functions;

import java.util.Scanner;

public class ex_05ProductOFTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = in.nextInt();
        System.out.print("Enter number :");
        int m = in.nextInt();
        System.out.println("The product is : " + product(m, n));



    }

    public static int product(int a, int b){
        if ( a == 0 || b == 0 ) return  0;
        return a * b;

    }
}
