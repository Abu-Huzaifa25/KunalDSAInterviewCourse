package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.IntermediatePG;

public class ex_13SumOfN_Nums {

    public static void main(String[] args) {

        System.out.println("Sum Of N - Numbers is : "+ sumOfNNums(33,66,90,45,44,73));
    }

    static float sumOfNNums(int ...runs){

        float sum = 0;
        for (int i = 0; i < runs.length; i++){
            sum += runs[i];

        }
        return sum;

    }
}
