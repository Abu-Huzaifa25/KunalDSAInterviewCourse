package DSAInterviewCourse.assignments.ex_05_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eg_9CreateTargetArray {
    public static void main(String[] args) {
        /*
        Question Link => https://leetcode.com/problems/create-target-array-in-the-given-order/description/
            [0]
            [0,1]
            [0,1,2]
            [0,1,3,2]
            [0,4,1,3,2]

            outPut is =>  [0,4,1,3,2]
         */
        int[] arr = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(arr, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> arr = new ArrayList<>(nums.length);

        for (int i = 0; i < index.length; i++){
            arr.add(index[i] , nums[i]);  // add(index, element)
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < nums.length; i++){
            result[i] += arr.get(i);
        }
        return result;

    }
}
