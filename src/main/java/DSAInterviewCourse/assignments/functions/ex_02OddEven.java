package DSAInterviewCourse.assignments.functions;

import java.util.Scanner;

public class ex_02OddEven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(oddEven(n));

    }

    public static String oddEven(int n){
        for (int i = 1; i <= n; i++){

            if ( n % 2 == 0){
                return "Even Number";
            }else {
                return "Odd Number";
            }
        }
        return "Even Number";
    }
}
