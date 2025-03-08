package DSAInterviewCourse.video.Linear_SearchAlgorithm;

public class SearchInString {
    public static void main(String[] args) {

        String name = "Abu Huzaifa";
        char target = 'A';
//        boolean isTrue = searchInString(name, target);
        boolean isTrue = searchInStringII(name, target);
        System.out.println(isTrue);
    }

    // using for-loop
    static boolean searchInString(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // using for-Each-loop
    static boolean searchInStringII(String str, char target){
        if (str.length() == 0) return false;

        for (char ch : str.toCharArray() ){
            if (ch == target){
                return true;
            }
        }

        return false;
    }






}
