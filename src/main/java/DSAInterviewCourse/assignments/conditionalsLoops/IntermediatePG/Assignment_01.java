package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

public class Assignment_01 {
    public static void main(String[] args) {
        int number = 5;
        int number2 = 6;

        long result = factorial(number);
        int result2 = factorialWithLoop(number2);
        System.out.println("Factorial of " + number + " is " + result);
        System.out.println("Factorial of " + number2 + " is " + result2);

    }

    public static int factorial(int n) {

        if (n < 0) {
            throw new ArithmeticException("Factorial is not defined for negative numbers");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int factorialWithLoop(int n) {
        if (n < 0) {
            throw new ArithmeticException("Factorial is not defined for negative numbers");
        }
        int factorial = 1; // Initialize the result to 1
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply the result by each number from 1 to n
        }
        return factorial;
    }
}

