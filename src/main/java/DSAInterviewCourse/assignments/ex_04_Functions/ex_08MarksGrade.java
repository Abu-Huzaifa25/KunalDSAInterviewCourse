package DSAInterviewCourse.assignments.ex_04_Functions;

public class ex_08MarksGrade {
    public static void main(String[] args) {

        System.out.println(grade(90,90,100,89,90,100));;
    }

    public static String grade(int hindi, int urdu,int math, int eng, int phy, int chem){
        int totalMarks = hindi+urdu+math+eng+phy+chem;
        int average = totalMarks/6;


        if (average >= 91 && average <= 100) {
            return "Grade => AA";
        } else if (average >= 81 && average <= 90) {
            return "Grade => AB";
        } else if (average >= 71 && average <= 80) {
            return "Grade => BB";
        } else if (average >= 61 && average <= 70) {
            return "Grade => BC";
        } else if (average >= 51 && average <= 60) {
            return "Grade => CD";
        } else if (average >= 41 && average <= 50) {
            return "Grade => DD";
        } else {
            return "Fail";
        }
    }
}
