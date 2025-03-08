package DSAInterviewCourse.video.conditional_and_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
            Syntax of for loops:
            for (initialisation; condition; increment/decrement) {
                // body
            }x
        */

        // Example: Print odd numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }

        // Example: Print numbers from 1 to n (user input)
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for (int num = 1; num <= n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello World");
//        }

        // while loop example
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }

        int num  = 1;
        while (num <= 5) {
//            System.out.println(num);
            num += 1;
        }

        // do-while loop example
        /*
            Syntax:
            do {
                // body
            } while (condition);
         */
        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1); // Runs at least once, even if condition is false initially

    }
}