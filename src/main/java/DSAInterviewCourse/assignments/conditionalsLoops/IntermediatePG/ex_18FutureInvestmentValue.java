package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

import java.util.Scanner;

public class ex_18FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the present value
        System.out.print("Enter Present Value: ");
        float presentValuePV = in.nextFloat();

        // Get the interest rate (as a decimal, e.g., 0.05 for 5%)
        System.out.print("Enter Interest Rate (e.g., 0.05 for 5%): ");
        float interestRateR = in.nextFloat();

        // Get the number of compounding periods
        System.out.print("Enter Number of Compounding Periods: ");
        float compoundPeriod_N = in.nextFloat();

        // Calculate the future investment value using compound interest
//        float futureValueFV = (float) (presentValuePV * Math.pow((1 + interestRateR), compoundPeriod_N));
        float futureValueFV = (float) (presentValuePV * Math.pow((compoundPeriod_N), 1 + interestRateR));

        // Output the result
        System.out.println("Future Investment Value: " + futureValueFV);

        in.close();
    }
}
