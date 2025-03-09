package DSAInterviewCourse.LeetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class LargestOddNumberInString1903 {
    public static void main(String[] args) {

        String s = "100";
        System.out.println(largestOddNumber(s));
    }


    public static String largestOddNumber(String num) {

        for (int i = num.length()-1; i >= 0; i-- ){
            int temp = Integer.valueOf(String.valueOf(num.charAt(i)));
            if (temp % 2 != 0 ){
                return num.substring(0, i+1);
            }

        }

        return "";
    }
}
