package DSAInterviewCourse.LeetCode;

public class GoalParser1678 {
    public static void main(String[] args) {

        String s = "G()(al)";
        System.out.println(interpret(s));
    }
    static String interpret(String command) {

        String str = "";

        for (int i = 0; i < command.length(); i++) {
            char ch = command.charAt(i);

            if (ch == '(' && i + 1 < command.length() && command.charAt(i + 1) == ')') {
                str += "o";
                i++; // Skip the next character ')'
            } else if (ch != ')') {
                str += ch;
            }
        }
        return str;
    }
    public String restoreString(String s, int[] indices) {
        String outputArr [] = new String[indices.length];
        for(int i = 0 ; i<indices.length;i++){
            int index = indices[i];
            outputArr[index] =String.valueOf(s.charAt(i)) ;
        }
        return outputArr.toString();
    }
}
