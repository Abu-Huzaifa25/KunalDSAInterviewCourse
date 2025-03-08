package DSAInterviewCourse.assignments.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class TwoSumII167 {
    public static void main(String[] args) {

        int [] arr = { 2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));

    }
    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++){
            int com = target - numbers[i];

            if (map.containsKey(com)){
                return new int[]{map.get(com) +1, i+1};
            }
            map.put(numbers[i],i);


        }
        return new int[]{-1,-1};
    }


    // First Solution but time complexity is to height
//    public static int[] twoSum(int[] numbers, int target) {
//
//        for (int i = 0; i < numbers.length; i++){
//            for (int j = 0; j < numbers.length; j++){
//                if (i == j){
//                    continue;
//                }
//                if (numbers[i] + numbers[j] == target){
//                    return new int[]{i+1, j+1};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }
}

