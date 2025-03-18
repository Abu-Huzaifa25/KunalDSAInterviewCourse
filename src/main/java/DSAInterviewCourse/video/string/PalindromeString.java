package DSAInterviewCourse.video.string;

public class PalindromeString {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true


    }

    static boolean isPalindrome(String s ){

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        StringBuilder builder = new StringBuilder(cleaned);
//        if (cleaned.equals(builder.reverse().toString())){
//            return true;
//        }
//        return false;

        int length = cleaned.length();
        if (cleaned == null || length == 0){
            return true;
        }


        for (int i = 0; i <= cleaned.length() / 2; i++){
            char start = cleaned.charAt(i);
            char end = cleaned.charAt(cleaned.length()-1-i);
            if (start != end){
                return false;
            }
        }
        return true;

    }
}
