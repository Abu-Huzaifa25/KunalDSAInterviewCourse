package DSAInterviewCourse.video.v11_function_and_Methods;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {


        // In method overloading function name can be same but ensure parameter should be different,
        fun(12);
        fun("Abu Huzaifa");
        fun("Abu", "Huzaifa");
        fun(1,2,34,2,3,4,5);
        fun(23, "Abu Hzuaifa");




    }



    // fun method name is same but all method all different parameters...

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    static void fun(String firstname, String lastname){
        System.out.println("First Name :"+ firstname +", Last Name : "+ lastname);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int rollnumber, String name){
        System.out.println("Roll Number : "+ rollnumber +", Name : "+ name);
    }
}
