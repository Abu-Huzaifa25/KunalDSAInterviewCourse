package DSAInterviewCourse.assignments.ex_04_Functions;

public class ex_14SumOfFirstNaturalNums {


    public static void main(String[] args) {


        // 14. Write a function that returns the sum of first n natural numbers.

        int n = 5;
        System.out.println(naturalNumbers(n));



//        System.out.println( n * ( n + 1) / 2 + "Don't try it");


    }

    static int naturalNumbers(int n ){
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }




}
