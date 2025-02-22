package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;
import java.util.Scanner;

public class Assignment_21 {
    public static void main(String[] args) {
        /*
            Q. Fibonacci Series In Java Programs

        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter valid number ");
        int input = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i <= input; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(a);









    }
}


