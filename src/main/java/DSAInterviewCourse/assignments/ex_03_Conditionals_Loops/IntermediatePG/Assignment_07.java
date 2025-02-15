package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.IntermediatePG;

import java.util.Scanner;

public class Assignment_07 {

    public static void main(String[] args) {

        //Calculate Commission Percentage

        System.out.println("Find Power in java as your wish");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base value : ");
        int base = in.nextInt();

        System.out.print("Enter exponent value : ");
        int exponent = in.nextInt();

        double result = powerExample(base, exponent);
        System.out.println("The value is "+ result);

    }



    static double powerExample(int base, int exponent ){

        double result = 0;

        result = Math.pow(base, exponent);

        return result;
    }


}