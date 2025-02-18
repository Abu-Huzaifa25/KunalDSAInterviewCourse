package DSAInterviewCourse.assignments.ex_04_Functions;

import java.util.Scanner;

public class ex_07PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = in.nextInt();

        if (isPrime(n)){
            System.out.println(n + " is prime number !");
        }else {
            System.out.println(n + " is not prime number !");
        }



    }

    public static boolean isPrime(int n){

        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i < n; i += 2){
            if (n % i == 0) return false;

        }
        return true;
    }
}
