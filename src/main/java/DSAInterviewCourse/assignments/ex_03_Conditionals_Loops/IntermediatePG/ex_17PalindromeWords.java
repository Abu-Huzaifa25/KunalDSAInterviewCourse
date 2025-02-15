package DSAInterviewCourse.assignments.ex_03_Conditionals_Loops.IntermediatePG;

public class ex_17PalindromeWords {
    public static void main(String[] args) {

        Boolean str = reverse("12321");
        System.out.println(str);
    }



    static boolean reverse(String str){
        String strOriginal = str;
        char ch;
        String s = "";


        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);

            s = ch + s;
        }

        return strOriginal.equals(s);
    }
}
