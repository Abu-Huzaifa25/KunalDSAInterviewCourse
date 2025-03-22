package DSAInterviewCourse.LeetCode;

public class ConsecutiveCharacters1446 {
    public static void main(String[] args) {

        System.out.println(maxPower("leetcode"));
    }


    public static int maxPower(String s) {

        int len = s.length();
        String low = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < len; i++){
            for (int j = i; j < len - 1; j++){
                if (low.charAt(i) == low.charAt(j+1) && i < j + 1){
                    count++;

                }
            }
        }

        return count;
    }

}
