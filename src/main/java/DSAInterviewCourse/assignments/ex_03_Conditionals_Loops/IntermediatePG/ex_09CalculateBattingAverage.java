package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.IntermediatePG;

public class ex_09CalculateBattingAverage {

    public static void main(String[] args) {


        System.out.println("Average is : "+ batAverage(33,66,90,190,44,73,07,44));
    }

    static float batAverage(int ...runs){

        float totalRuns = 0;
        float average = 0;
        for (int i = 0; i < runs.length; i++){
            totalRuns += runs[i];
            average = totalRuns / runs.length;

        }
        return average;

    }
}
