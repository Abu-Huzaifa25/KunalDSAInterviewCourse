package DSAInterviewCourse.video.v08_first_JavaProgram;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input : ");

//        int rollNumber = input.nextInt();
//        System.out.println("Yor roll number is: " + rollNumber);

//        float marks = input.nextFloat();
//        System.out.println("Your marks is : " + marks); // if taking Integer but returns float

        String name = input.next();
        System.out.println("Hey " + name);



    }
}
