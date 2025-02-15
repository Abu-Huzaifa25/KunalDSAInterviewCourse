package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.BasicPG;
import java.util.Scanner;

public class Assignment_18 {
    public static void main(String[] args) {
        /*
            Q. Volume Of Pyramid
            Formula :  v = l * w * h / 3
            where....,
            l = Base length
            w = Base width
            h = Pyramid height
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Base length l : ");
        float l = sc.nextInt();

        System.out.println("Base width w : ");
        float w = sc.nextInt();

        System.out.println("Pyramid height h : ");
        float h = sc.nextInt();

        double v = 0;
        v =  l * w * h / 3;

        System.out.println("The Volume Of Sphere is : " + v);




    }
}


