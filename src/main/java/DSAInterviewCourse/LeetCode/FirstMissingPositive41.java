package DSAInterviewCourse.LeetCode;


public class FirstMissingPositive41 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
    }


    public static int firstMissingPositive(int[] nums) {

        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] -1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]){
                // Swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else i++;
        }

        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1){
                return index + 1;
            }
        }

        return nums.length + 1;

    }
}
