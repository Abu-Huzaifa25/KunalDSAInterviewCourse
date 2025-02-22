package DSAInterviewCourse.assignments.arrays;

import java.util.ArrayList;
import java.util.List;

public class eg_06GreatestNumberOfCandies {
    // Question Link => https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

    /*
        Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]

     */
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 1, 3};
        int candies = 3;
        System.out.println(kidsWithCandies(arr, candies));

    }
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //For each kid check if candies[i] + extraCandies ≥ maximum in Candies[i].
        List<Boolean> booleans = new ArrayList<>(candies.length);

        int  maxCandies = 0;
        for (int candy : candies){
            if (candy > maxCandies){
                maxCandies = candy;
            }
        }
        for (int candy : candies){
            booleans.add( candy + extraCandies >= maxCandies);
        }
        return booleans;



    }
}
