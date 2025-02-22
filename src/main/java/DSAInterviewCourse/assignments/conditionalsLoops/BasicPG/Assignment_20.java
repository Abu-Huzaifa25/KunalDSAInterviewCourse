package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;
import java.util.Scanner;

public class Assignment_20 {
    public static void main(String[] args) {
        /*
            Q. Total Surface Area Of Cube
            Formula : TSA=6a²
            where....,
            a, is the length of one side of the cube.

        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Base length of one side of the cube a =  ");
        float a = sc.nextInt();

        double TSA = 0;

        TSA = 6 * a * a;


        System.out.println("Curved Surface Area Of Cylinder is : " + TSA +"cm");




    }
}


