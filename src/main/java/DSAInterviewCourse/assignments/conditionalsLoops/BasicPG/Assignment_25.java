package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_25 {
    public static void main(String[] args) {
        /*

            Q. Take integer inputs till the user enters 0 and print the largest number from all.
        */
        Scanner sc = new Scanner(System.in);
        int largeNum = 0;
        while (true){
            System.out.print("enter num to find all of them : ");
            int num = sc.nextInt();
            int temp = 0;

            if (num != 0){

                if (num > temp){
                    temp = num;
                    largeNum = temp;
                }

            }else if (num == 0){
                break;
            }
        }
        System.out.println("The large number : " + largeNum);










    }
}


