package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

public class ex_14Armstrong {
    public static void main(String[] args) {

        System.out.println(armstrong(1634));
    }


    static boolean armstrong(int n){
        int original = n;
        int sum = 0;
        int length = String.valueOf(n).length();


        while (n > 0){
            int rem = n % 10;
            sum += Math.pow(rem, length);
            n /= 10;
        }
        return sum == original;

    }
}
