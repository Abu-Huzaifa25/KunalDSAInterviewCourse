package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class LeetCodeQuestion {

    public static void main(String[] args) {
           String output = restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3});
        System.out.println(">>> "+output);
    }

    public static String restoreString(String s, int[] indices) {
        String []outputArr = new String[indices.length];
        for(int i = 0 ; i<indices.length;i++){
            int index = indices[i];
            outputArr[index] =String.valueOf(s.charAt(i)) ;
        }
        StringBuilder str = new StringBuilder();
        for (String string : outputArr) {
            str.append(string);
        }
        return str.toString();
    }
}
