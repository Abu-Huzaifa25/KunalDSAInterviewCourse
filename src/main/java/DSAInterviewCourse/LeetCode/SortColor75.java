package DSAInterviewCourse.LeetCode;

class SortColor75 {

    public static void main(String[] args) {

        int [] arr = {2,0,2,1,1,0};
        sortColors(arr);


    }


    public static void sortColors(int[] nums) {

        int len = nums.length;
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                if (nums[j] < nums[j + 1]){
                    

                }
            }
        }
        
        
    }
}