package DSAInterviewCourse.video.v08_first_JavaProgram;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int num  = input.nextFloat(); // I can't do this because int is smaller than Float ;
        // float num = input.nextInt(); // i can do this because float > than int (nextInt())

        int num = (int) 12.4; // 12.4 is float but cast to the int ;
//        System.out.println(num);


        // automatic type promotion in expressions

//        int a = 257;
//        byte b = (byte) a; // print -> 1 because byt value take 256 so it returns 1  -> 257%256 = 1 Module
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2; can't do

        int number = 'A';
//        System.out.println(number);
//        System.out.println("नमस्ते");
        System.out.println("اَلسَلامُ عَلَيْكُم وَرَحْمَةُ اَللهِ وَبَرَكاتُهُ ،الفاروقیہ");
        byte b = 42;
        char c = 'c';
        short s = 1024;
        int i = 505660;
        float f = 3.55f;
        double d = 234.4444;
        double result = (f * b) + ( i / c )  - ( d * s);
        System.out.println(result);
        System.out.println((f * b) +" "+ ( i / c )  +" "+ ( d * s));
    }
}
