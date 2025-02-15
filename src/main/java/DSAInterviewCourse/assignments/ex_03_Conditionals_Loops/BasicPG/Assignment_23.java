package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.BasicPG;
import java.util.Scanner;

public class Assignment_23 {
    public static void main(String[] args) {
        /*
            Q. Input a number and print all the factors of that number (use loops).

        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter valid number ");
        int input = sc.nextInt();


            if (input != 0) {
                for (int i = 1; i <= input; i++) {
                    if (input % i == 0) {
                        System.out.println("The factors of the number : " + i);
                    }
                }
            }else {
                System.out.println("the number is zero so can't be factors");
            }











    }
}


