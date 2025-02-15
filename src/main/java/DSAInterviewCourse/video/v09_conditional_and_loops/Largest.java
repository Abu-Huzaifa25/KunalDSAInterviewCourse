package DSAInterviewCourse.video.v09_conditional_and_loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3  random numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = 0;

        if ( a > b){
            max = a;
        }if ( b > c ){
            max = b;
        }if ( c > a ){
            max = c;
        }
        System.out.println("Max is : "+ max);

    }
}
