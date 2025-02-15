package DSAInterviewCourse.video.v11_function_and_Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        // Check is prime number or not

        Scanner scanner = new Scanner(System.in);
//        int istrue = scanner.nextInt();

        for (int i = 100; i <= 1000; i++){
            if (isArmstrong(i)){
                System.out.print(i + ", ");
            }

        }


    }


    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while ( n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return  sum == original;  // return true otherwise false
//        if (original == n){
//            return true;
//        }else {
//            return false;
//        }



    }
}
