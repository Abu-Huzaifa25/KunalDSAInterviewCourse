package DSAInterviewCourse.assignments.ex_04_Functions;

public class ex_8MarksGrade {
    public static void main(String[] args) {

        System.out.println(grade(8,7,7,8,9,7));;
    }

    public static String grade(int hindi, int urdu,int math, int eng, int phy, int chem){
        int totalMarks = hindi+urdu+math+eng+phy+chem;
        int average = totalMarks/6;


        if (average <= 100 || average >= 91){
            return "Grade => AA";
        }else if ( average <= 90 || average >= 81 ){
            return "Grade => AB";
        }else {
            return "Fail";
        }

    }
}
