package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies1431 {
    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> booleans = new ArrayList<>();
        int maxCandies = 0; // get max candies frm array

        for (int i = 0; i < candies.length; i++){
            if (candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }
        for (int i = 0 ; i < candies.length; i++){
            booleans.add(candies[i] + extraCandies >= maxCandies );
        }
        return booleans;
    }
}
