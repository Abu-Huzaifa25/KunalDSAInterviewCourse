//package DSAInterviewCourse.assignments.ex_05_Arrays;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//
//public class eg_10Pangram {
//    public static void main(String[] args) {
//
//        // Question Link => https://leetcode.com/problems/check-if-the-sentence-is-pangram/
//        String string_1 = "abcdefghijklmnopqrstuvwxyz";
//        String string_2 = "The quick brown fox jumps over the lazy dog";
//        String string_3 = "leetCode";
//
//        System.out.println(checkIfPangram(string_3));
//
//
//    }
//
//    public static boolean checkIfPangram(String string){
//        for( char ch = 'a'; ch <= 'z'; ch++){
//            boolean found = false;
//
//            for (int i = 0; i < string.length(); i++){
//                if (ch == Character.toLowerCase(string.charAt(i))){
//                    found = true;
//                    break;
//                }
//            }
//            if ( !found ) return false;
//
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean checkPanagrm(String string){
//        HashSet<Character> uniqueChars = new HashSet<>();
//
//        for (int ch = 0 ; ch < string.length(); ch++){
//            if (Character.isLetter(ch)){
//                uniqueChars.add((char) ch);
//            }
//        }
//
//    }
//}
