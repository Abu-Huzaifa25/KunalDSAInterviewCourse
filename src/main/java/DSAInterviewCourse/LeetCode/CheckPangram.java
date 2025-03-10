package DSAInterviewCourse.LeetCode;

public class CheckPangram {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean found = false;
        for (char ch = 'a'; ch <= 'z'; ch++) {
//            int index =  sentence.indexOf(ch);
//            if(index== -1){
//                return false;
//            }
            for (int i = 0; i < sentence.length(); i++) {
                if(ch == Character.toLowerCase(sentence.charAt(i))) {
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if (found == false) return false;

        }
        return found;
    }
}
