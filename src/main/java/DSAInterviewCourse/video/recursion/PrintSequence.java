package DSAInterviewCourse.video.recursion;

public class PrintSequence {

    public static void main(String[] args) {
//        print5(5); // Calling the Number function
        message("hello - 5 "); // calling string function

    }


//    static void print5(int n) {
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int i) {
//        System.out.println(i);
//        print3(3);
//    }
//
//    static void print3(int i) {
//        System.out.println(i);
//        print2(2);  // Added missing function call
//    }
//
//    static void print2(int i) {
//        System.out.println(i);
//        print1(1);  // Continue sequence
//    }
//
//    static void print1(int i) {
//        System.out.println(i);
//    }



    static void  message(String s){
        System.out.println(s);
        message4("Hello - 4");
    }
    static void message4(String s) {
        System.out.println(s);
        message3("Hello - 3");
    }

    static void message3(String s) {
        System.out.println(s);
        message2("Hello - 2");
    }

    static void message2(String s){
        System.out.println(s);
        message1("Hello - 1");
    }
    static void message1(String s){
        System.out.println(s);
    }

}
