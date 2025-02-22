package DSAInterviewCourse.assignments.conditionalsLoops.IntermediatePG;

import java.util.Scanner;

public class ex_21JavaProgramVowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);

        in.close();

        if (vowelOrConsonant(ch)){
            System.out.println( ch +  " is a Vowel.");
        }else if (Character.isLetter(ch)){
            System.out.println(ch + " is consonants.");
        }else {
            System.out.println(ch + " is not a letter");
        }



    }

    static boolean vowelOrConsonant(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
