package DSAInterviewCourse.video.string;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name = "Abu Huzaifa";
        System.out.println("String Convert into char-Arrays >> " + Arrays.toString(name.toCharArray()));

        String stringToArray = "I am learning Java programming";
        System.out.println("String Convert into Arrays >> " + Arrays.toString(stringToArray.split(" ")));

    }
}
