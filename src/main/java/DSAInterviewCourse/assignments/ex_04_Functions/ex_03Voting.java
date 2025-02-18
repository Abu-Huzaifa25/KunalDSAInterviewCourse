package DSAInterviewCourse.assignments.ex_04_Functions;

import java.util.Scanner;

public class ex_03Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age ?");
        int age = in.nextInt();
        System.out.println(isEligibleToVote(age));



    }

    public static String isEligibleToVote(int age){

        if (age >= 18){
            return "eligible to vote";
        }else {
            return "not eligible to vote";
        }

    }
}
