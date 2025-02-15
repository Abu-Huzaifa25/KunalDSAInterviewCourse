package DSAInterviewCourse.video.v09_conditional_and_loops;

public class Reverse {
    public static void main(String[] args) {
        int num = 1234; // 4321

        int result = 0;
        while( num > 0){
            int rem = num % 10;

            num /= 10;

            result = result * 10 + rem;



        }
        System.out.println("Input 1234 : " +result);


        int ans = 0;
        while (result > 0){
            int rem = result % 10;
            result /= 10;

            ans  = ans * 10 + rem;
        }

        System.out.println("Input 4321 : " + ans);
    }
}
