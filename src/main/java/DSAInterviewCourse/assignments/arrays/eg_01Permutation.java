package DSAInterviewCourse.assignments.arrays;

import java.util.Arrays;

public class eg_01Permutation {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new int[]{0,2,1,5,3,4}));
    }


    static int[] buildArray(int[] nums) {

        int [] ans = new int[nums.length];

        for (int i = 0; i <  nums.length; i++){
            ans[i] = nums[i];
            ans[i] = ans[nums[i]];
        }

        return ans;

    }
}
