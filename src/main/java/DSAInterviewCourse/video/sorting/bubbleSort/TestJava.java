package DSAInterviewCourse.video.sorting.bubbleSort;

import java.util.Arrays;

public class TestJava {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};
        sorts(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorts(int [] nums){

        int len = nums.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) { // Swap if the element is greater than the next
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }
}
