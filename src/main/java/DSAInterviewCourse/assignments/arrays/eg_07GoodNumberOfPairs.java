package DSAInterviewCourse.assignments.arrays;

public class eg_07GoodNumberOfPairs {
    /*

       Link ==> https://leetcode.com/problems/number-of-good-pairs/description/

     */
    public static void main(String[] args) {

        int [] arr = {1,2,3,1,1,3};
//        int [] arr = {1, 1, 1, 1};
//        int arr [] = {1,2,3};
        System.out.println(numIdenticalPairs(arr));

    }

    static int numIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0 ; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if ( i < j && nums[i] ==  nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
