package DSAInterviewCourse.LeetCode;

import java.util.Arrays;

public class Concatenation1929 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }

    static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[ n * 2 ];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n ] = nums[i];
        }

        return ans;
    }
}
