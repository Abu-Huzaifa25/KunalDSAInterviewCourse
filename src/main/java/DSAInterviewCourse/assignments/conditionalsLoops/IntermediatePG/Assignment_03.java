package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

import java.util.Scanner;

public class Assignment_03 {

    public static void main(String[] args) {


        // 3. Calculate Average Of N Numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to find Average : ");
        int n = scanner.nextInt();
        int temp = 0;
        for (int i = 1 ; i <= n; i++){
            temp += i;
        }
        float average =(float) temp/n;
        System.out.println("Average Of N Number is : " + average);










    }



}