package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

import java.util.Scanner;

public class Assignment_06 {

    public static void main(String[] args) {

        //Calculate Commission Percentage

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Total Revenue : ");
        float revenue = in.nextInt();

        System.out.print("Enter your commission Rate : ");
        float commissionRate = in.nextInt();

        double totalCommission = commissionPercentage(revenue, commissionRate);

        System.out.println("Total Commission : " + totalCommission);


    }

    static double commissionPercentage(float revenue, float commissionRate ){

        float commission = 0;
        commission = revenue * commissionRate/ 100;

        return  commission;



    }






}