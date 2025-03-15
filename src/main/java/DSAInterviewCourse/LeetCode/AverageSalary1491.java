package DSAInterviewCourse.LeetCode;

public class AverageSalary1491 {
    public static void main(String[] args) {

        int [] salary = {8000,9000,2000,3000,6000,1000};
        System.out.println(average(salary));
    }

    public static double average(int[] salary) {

        double sum = 0;
        int count = 0;

        for (int e : salary){
            sum += e;
            count++;
        }
//        return Math.floor( sum / count);x
        return Math.round((sum / count)/ 250.0) * 250.0;
//        Exact is 4833.33333
//        4750.00000
    }
}
