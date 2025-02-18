package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.IntermediatePG;

import java.util.Scanner;

public class ex_20LCMOfTwoNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num1 = in.nextInt();

        System.out.print("Enter Number : ");
        int num2 = in.nextInt();

        int result = leastCommonMultiple(num1, num2);

        System.out.println("least Common Factor is :"+ result);

    }

    static int highestCommonFactor(int a, int b){

        while (b != 0) {
            int temp = b; // 12
            b = a % b; // 12 % 18 => 12
            a = temp; // 18 == 12
        }
        return a;
    }

    static int leastCommonMultiple(int a, int b){
        return a * b / highestCommonFactor(a, b);
    }
}

