package DSAInterviewCourse.assignments.functions;

import java.util.Scanner;

public class ex_01maxMin {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The max Number is : " + max(a, b));
        System.out.println("The min Number is : " + min(a, b));

    }

    static int max(int a, int b){

        if (a == 0 && b == 0) return 0;

        while ( a != b){
            if ( a > b) return a;

            return  b;
        }

        return a;
    }


    static int min(int a, int b){
        if (a == 0 && b == 0) return 0;

        while ( a != b){
            if ( a < b) return a;

            return  b;
        }

        return a;
    }
}
