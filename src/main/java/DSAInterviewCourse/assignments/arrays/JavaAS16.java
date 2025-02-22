package DSAInterviewCourse.assignments.arrays;

public class JavaAS16 {
    public static void main(String[] args) {

        int [] findEven = {12,345,2,6,7896};

        System.out.println(findNumbers(findEven));
    }
    static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
