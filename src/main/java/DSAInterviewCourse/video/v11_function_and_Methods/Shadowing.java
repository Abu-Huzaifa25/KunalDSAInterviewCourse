package DSAInterviewCourse.video.v11_function_and_Methods;

public class Shadowing {

    static int x = 34; // this x scope starting here to last one close } ;

    public static void main(String[] args) {
        System.out.println(x);

        int x = 234;
        System.out.println(x);

        fun(x); // x = 234

    }

    static void fun(int x){
        System.out.println(x); /// x = 234;
    }

}
