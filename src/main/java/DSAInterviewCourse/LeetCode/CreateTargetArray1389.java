package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] indexes = {0,1,2,2,1} ;
        System.out.println(Arrays.toString(createTargetArray(nums, indexes)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            integers.add(index[i], nums[i]);
        }
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = integers.get(i);
        }

        return ans;
    }
}
