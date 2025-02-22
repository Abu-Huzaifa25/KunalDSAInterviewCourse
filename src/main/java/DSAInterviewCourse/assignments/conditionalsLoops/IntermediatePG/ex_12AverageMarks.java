package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

public class ex_12AverageMarks {

    public static void main(String[] args) {

        System.out.println("Average of Marks is : "+ studentMarksAvg(33,66,90,45,44,73));
    }

    static float studentMarksAvg(int ...runs){

        float totalMarks = 0;
        float average = 0;
        for (int i = 0; i < runs.length; i++){
            totalMarks += runs[i];
            average = totalMarks / runs.length;

        }
        return average;

    }
}
