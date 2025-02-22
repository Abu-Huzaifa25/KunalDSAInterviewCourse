package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

public class ex_16ReverseAStringInJava {
    public static void main(String[] args) {

        String str = reverse("Book"); // Reverse String
        System.out.println(str);
    }

    static String reverse(String str){

        char ch;
        String s = "";

        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);

            s = ch + s;
        }
        return  s;


    }


}
