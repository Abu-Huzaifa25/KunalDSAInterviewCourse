package DSAInterviewCourse.video.function_and_Methods;

import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : " );
        String name = scanner.nextLine();
        System.out.println(myGreet(name));
    }

    public static String myGreet(String name){
        String message = "Hello " + name;
        return message;

    }
}
