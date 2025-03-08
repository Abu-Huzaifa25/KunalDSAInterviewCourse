package DSAInterviewCourse.assignments.searching;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int [] arrays = {1,3,5,6};
        int target = 3;

        System.out.println(searchInsert(arrays, target));
    }

    public static int searchInsert(int[] nums, int target) {


        int low = 0;
        int height = nums.length-1;

        while (low <= height){
            int mid = low + ( height - low);
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target){
                height = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
}
