package DSAInterviewCourse.video.recursion;

public class DemoRecursion {


    public static void main(String[] args) {
        message();
    }

    static void message(){
        System.out.println("Hello Java Recursion");
        message1();
    }

    static void message1(){
        System.out.println("Hello Java Recursion 1");
        message2();
    }
    static void message2(){
        System.out.println("Hello Java Recursion 2");
    }
}
