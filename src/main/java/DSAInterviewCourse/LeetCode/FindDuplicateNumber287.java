package DSAInterviewCourse.LeetCode;

public class FindDuplicateNumber287 {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1,3,4,2,2}));
    }

    public static int findDuplicate(int[] nums) {

        int i = 0;
        while ( i < nums.length){
            if(nums[i] != i + 1){
                int correctIndex = nums[i] -1;
                if (nums[i] != nums[correctIndex]){
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                }else return nums[i];
            }else i++;
        }


        return -1;

    }
}
