package DSAInterviewCourse.assignments.conditionalsLoops.BasicPG;
import java.util.Scanner;

public class Assignment_19 {
    public static void main(String[] args) {
        /*
            Q. Curved Surface Area Of Cylinder
            Formula : CSA=2πrh
            where....,
            r is the radius of the base of the cylinder
            h is the height of the cylinder.

            pi = 3.14159265359
        */
        Scanner sc = new Scanner(System.in);

        System.out.print("Base radios r =  ");
        float r = sc.nextInt();

        System.out.print("Height of the Cylinder = ");
        float h = sc.nextInt();
        float  pi = 3.14159265359f;
        double CSA = 0;

        CSA=2 * pi * r * h;


        System.out.println("Curved Surface Area Of Cylinder is : " + CSA +"cm");




    }
}


