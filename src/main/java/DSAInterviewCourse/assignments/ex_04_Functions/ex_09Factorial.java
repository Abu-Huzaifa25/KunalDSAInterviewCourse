package DSAInterviewCourse.assignments.ex_04_Functions;

public class ex_09Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }


    public static int factorial(int n){
        if (n == 0)return 1;
        if (n == 1)return 1;

        int temp = 1;
        for (int i = 1; i <= n; i++){
            temp *= i;
        }
        return temp;
    }
}
