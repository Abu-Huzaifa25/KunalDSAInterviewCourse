package DSAInterviewCourse.video.v08_first_JavaProgram;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp C : ");

        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5 )+32;
        System.out.println(tempF);

    }
}
