package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class FairCandySwap888 {
    public static void main(String[] args) {

        int [] candy = {1,2};
        int [] candy2 = {2,3};
        System.out.println(Arrays.toString(fairCandySwap(candy, candy2)));

    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int cn = distributeCandies(aliceSizes);
        int bob = distributeCandies(bobSizes);
        return new int[]{cn, bob};
    }


    public static int distributeCandies(int [] candies ){
        int totalCandies = 0;
        for (int i = 0; i < candies.length; i++){
            totalCandies += candies[i];
        }
        totalCandies /= 2;
        return totalCandies;
    }
}

