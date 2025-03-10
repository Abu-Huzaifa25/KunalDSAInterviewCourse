package DSAInterviewCourse.GeeksForGeeks;

import java.util.Arrays;

public class CheckEvenorOdd {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(oddEven(new int[]{2, 3, 4, 5, 6, 7})));

    }

    public static String[] oddEven(int[] nums) {
        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[i] = nums[i] + " Even";
            } else {
                result[i] = nums[i] + " Odd";
            }
        }
        return result;
    }
}
