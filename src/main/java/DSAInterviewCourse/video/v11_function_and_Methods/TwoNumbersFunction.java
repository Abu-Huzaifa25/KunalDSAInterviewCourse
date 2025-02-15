package DSAInterviewCourse.video.v11_function_and_Methods;


public class TwoNumbersFunction {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;
        int total = sum(a, b);
        int sub = subtract(a, b);
        int multiplication = multiplication(a, b);
        float div = divide(a, b);
        float remainder = modulus(a, b);
        System.out.println("The total is : "+total);
        System.out.println("The subtract is : "+sub);
        System.out.println("The multiplication a,b is : " + multiplication);
        System.out.println("The divide is : "+ div);
        System.out.println("The remainder is : "+ remainder);
    }

    // Addition ( a * b )
    public static int sum(int a, int b){
        return (a + b);
    }

    // Subtract ( a - b )
    public static int subtract(int a, int b){
        return (a - b);
    }

    // Multiplication ( a * b )
    public static int multiplication(int a, int b){
        return a * b;
    }

    // Divide ( a / b ) -- Ensure that when dividing any value, it is clear and no value is lost. Use float values.
    public static float divide(float a, float b ){
        return a / b;

    }

    // modulus ( Reminder  a % b )

    public static float modulus(float a, float b){
        return a % b;
    }



}
