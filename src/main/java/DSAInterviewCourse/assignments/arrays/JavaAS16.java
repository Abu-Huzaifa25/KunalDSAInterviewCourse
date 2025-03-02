package DSAInterviewCourse.assignments.arrays;

public class JavaAS16 {
    public static void main(String[] args) {

        int [] findEven = {1771};

        System.out.println(findNumbers(findEven));
    }
    static int findNumbers(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++){
            String numStr = String.valueOf(nums[i]);
            int n = numStr.length();

            if (nums[i] % 2 == 0 &&  n % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
