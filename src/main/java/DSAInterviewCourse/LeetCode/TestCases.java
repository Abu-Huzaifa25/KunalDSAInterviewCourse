package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCases {
    public static void main(String[] args) {
        int[] nums = {1,4};
        int target = 4;

        System.out.println(Arrays.toString(lastPosition( nums, target)));
    }

    public static int [] lastPosition(int [] nums, int target){
//        int start = 0, end = nums.length-1;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                list.add(i);
            }
        }
        if (list.isEmpty()){
            return new int[]{-1,-1};
        }
        int[] ar = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ar[i] = list.get(i);
            if (list.size() <= 1 ){
                return new int[]{i, i};
            }
        }
        return ar;

    }
}
