package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.IntermediatePG;

import java.util.Scanner;

public class ex_22PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println( isPerfectNumber(n));
    }

    public static boolean isPerfectNumber(int n){
        int sum = 0;
        int original = n;
        for (int i = 1; i < n; i++){
             if (n % i == 0){
                 sum = sum + i;
             }
        }
        return original == sum;
    }
}
