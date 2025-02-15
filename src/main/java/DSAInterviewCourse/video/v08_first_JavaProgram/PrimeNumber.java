package DSAInterviewCourse.video.v08_first_JavaProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        if (n <= 1){
            System.out.println("Neither prime nor composite");
            return;
        }

        int c = 2;
        while (c * c <= n){
            if (n % 2 == 0){
                System.out.println("Not a prime Number");
                return;
            }
            c = c + 1;
        }
        if ( c * c > n){
            System.out.println("Prime");
        }
    }
}
