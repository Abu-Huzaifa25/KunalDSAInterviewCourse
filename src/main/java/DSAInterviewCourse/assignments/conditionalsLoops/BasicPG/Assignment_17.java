package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;

import java.util.Scanner;

public class Assignment_17 {
    public static void main(String[] args) {

        // Volume Of Sphere
        // Formula : V = 4/3 π r³
        // Where r is the radius of the sphere.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the sphere r : ");
        float r = sc.nextInt();
        float pi = 3.14159f;

        double v = 0;
        v =  4 * pi * r * r * r / 3;

        System.out.println("The Volume Of Sphere is : " + v);




    }
}


