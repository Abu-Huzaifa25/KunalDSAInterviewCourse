package DSAInterviewCourse.video.Linear_SearchAlgorithm;

public class LinearSearchReturnIndexOrValue {
    public static void main(String[] args) {

        int[] nums = {17, 26, 33, 45, 57, 76, 77, 98, 39};
        int target = 39;
        int index = 4;

//        System.out.println(returnIndex(nums, target));
//        System.out.println(returnValueOfIndex(nums, target));
        System.out.println(returnValueWithTargetIndex(nums, index));

    }


    public static int returnIndex(int [] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }


    public static int returnValueOfIndex(int[] nums, int target ){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return nums[i];
            }
        }

        return -1;
    }

    public static int returnValueWithTargetIndex(int[] nums, int index){
        for (int i = 0; i < nums.length; i++){
            if ( i == index){
                return nums[i];
            }
        }
        return -1;
    }
}

