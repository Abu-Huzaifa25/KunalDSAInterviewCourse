package DSAInterviewCourse.assignments.searching;

public class SquareRoot69 {
    public static void main(String[] args) {

        int ans = mySqrt(4);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int) sqrt;
    }
}
