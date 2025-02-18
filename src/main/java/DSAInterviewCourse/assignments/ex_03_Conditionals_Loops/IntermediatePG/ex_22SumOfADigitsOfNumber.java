package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.IntermediatePG;

import java.util.Scanner;

public class ex_22SumOfADigitsOfNumber {
    public static void main(String[] args) {

        // This assignment think less
        // Not solved assignment
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println( "The sum of numbers is " + isSumOfDigits(n));
    }

    public static int isSumOfDigits(int n){
        int sum = 0;
        int original = n;
        while (n != 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;

        }
        return sum;
    }
}
