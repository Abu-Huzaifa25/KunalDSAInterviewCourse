package DSAInterviewCourse.LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllNumbersDisappeared448 {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> arr = findDisappearedNumbers(nums);
        System.out.println(arr);

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while ( i  < nums.length){
            int correctIndex = nums[i]-1;

            if (nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else i++;
        }


        List<Integer> list = new ArrayList<>();

        for (int index = 0; index <= nums.length-1; index++){
            if (nums[index] != index + 1){
                list.add(index + 1);
            }
        }

        return list;

    }
   
}