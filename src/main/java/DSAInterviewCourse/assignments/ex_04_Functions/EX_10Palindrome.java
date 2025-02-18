package DSAInterviewCourse.assignments.ex_04_Functions;

import java.lang.foreign.MemorySegment;

public class EX_10Palindrome {
    public static void main(String[] args) {
//        String str = "madam";
//        if (palindromeWord(str)){
//            System.out.println(str + " is palindrome Word");
//        }else {
//            System.out.println(str + " is not palindrome Word");
//        }

        int n = 1112111;
        if (palindromeNumber(n)){
            System.out.println(n + " is palindrome number");
        }else {
            System.out.println(n + " is not palindrome number");
        }
    }

    public static boolean palindromeWord(String str){

        String original = str;
        String reverse = "";
        char ch;

        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            reverse = ch + reverse;

        }
        return reverse.equals(original);

    }

    public static boolean palindromeNumber(int n){

        int reverse = 0;
        int temp = Math.abs(n);

        while (temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        return reverse == Math.abs(n);

    }
}
