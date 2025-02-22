package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_24 {
    public static void main(String[] args) {
        /*
            Q. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        */
        Scanner sc = new Scanner(System.in);



        int temp = 0;
//        while (true){
//            System.out.print("Enter numbers (enter 0 to stop and sum all of) :");
//            int input = sc.nextInt();
//            if (input != 0){
//                temp += input;
//            }else if ( input == 0){
//                System.out.println(temp);
//                break;
//            }
//        }
        int input = 0;
        do {
            System.out.print("Enter numbers (enter 0 to stop and sum all of) :");
            input = sc.nextInt();
            temp += input;

        }while(input != 0);
        System.out.println("The sum of all entered numbers is: " + temp);






    }
}


