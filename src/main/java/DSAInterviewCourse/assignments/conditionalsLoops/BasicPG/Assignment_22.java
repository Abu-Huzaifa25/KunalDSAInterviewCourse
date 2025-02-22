package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_22 {
    public static void main(String[] args) {
        /*
            Q. Given an integer number n, return the difference between the product of its digits and the sum of its digits.

        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter valid number ");
        int input = sc.nextInt();
        String numStr = String.valueOf(input);

        int product = 1, sum = 0;

        for (int i = 0; i <= numStr.length()-1; i++){
            if (input != 0){
                int temp = input % 10;
                product *= temp ; // 4
                sum  += temp ; // 4
                input /= 10;
            }
        }

        int difference = product - sum;
        System.out.println("difference between product and sum "+
                product +" - " +sum +" : " + difference);













    }
}


