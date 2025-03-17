package DSAInterviewCourse.video.arraysAndArrayList;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(1,2,3,4,5,43,3,3,45,5,6);

        stringVarArgs("Abu Huzaifa", "Usaman", "Rahman", "Anas", "Azeem");

        varArgsInt("Azeem", 1,2,3,4,5,64,3,3);


    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void stringVarArgs(String ...nameOfStudents){
        System.out.printf(Arrays.toString(nameOfStudents));
    }

//    static void intStringVarArgs(int a, int b, String ...name){
//        System.out.println(Arrays.toString( name));
//    }

    static void varArgsInt(String a, int ...b){
        System.out.println(a);
        System.out.println(Arrays.toString(b));
    }

}
