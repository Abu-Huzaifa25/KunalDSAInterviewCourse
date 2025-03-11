package DSAInterviewCourse.LeetCode;

public class BinarySearch704 {
    public static void main(String[] args) {

        int [] nums = {2,5};
        int  target = 5;

        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {

        if (nums[0] == target && nums.length == 1){
            return 0;
        }

        int start = 0, end = nums.length-1;
        while (start <= end){
            int mid = start + ( end - start ) / 2;
            if (nums[mid] > target){
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
