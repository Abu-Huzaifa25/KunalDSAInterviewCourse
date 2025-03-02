package DSAInterviewCourse.assignments.arrays;

import java.util.ArrayList;
import java.util.List;

public class eg_11CountItems {
    public static void main(String[] args) {

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(ruleValue) && items.get(i).equals(ruleKey)){
                count++;
            }
        }
        return count;

    }
}
