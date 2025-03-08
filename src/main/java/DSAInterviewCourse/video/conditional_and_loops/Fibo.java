package DSAInterviewCourse.video.conditional_and_loops;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Read the number of terms for the Fibonacci series from user input
        int n = in.nextInt();

        // Initialize the first two numbers of the Fibonacci series: 0 and 1
        int a = 0;
        int b = 1;

        // Initialize a counter to track the number of terms generated
        int count = 2;

        // Loop to calculate the Fibonacci series up to the nth term
        while (count <= n) {
            // Store the current value of b in a temporary variable
            int temp = b;

            // Update b to be the sum of the previous two numbers (a + b)
            b = b + a;

            // Update a: to hold the previous value of b (before it was updated)
            a = temp;

            // Increment the counter to track the next term
            count++;
        }

        // Print the nth Fibonacci number
        System.out.println(b);
    }
}
