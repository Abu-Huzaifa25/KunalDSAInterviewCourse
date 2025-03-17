package DSAInterviewCourse.video.v15_binarySearchAlgorithmInterviewQuest;

public class Ceiling {
    public static void main(String[] args) {
        int [] arr  = {2, 5, 8, 10, 14, 18};
        int target = 9;
        System.out.println("Celling :" +ceilingOfNumber(arr, target));

    }

    static int ceilingOfNumber(int [] arr , int target){
        int left = 0;
        int right = arr.length-1;

        int celling = -1;

        while (left <= right){
            int mid = left + ( right - left )/ 2;

            if (arr[mid] == target){
                return arr[mid];
            }else if (arr[mid] < target) {
                left = mid + 1;
            }else {
                celling = arr[mid];
                right = mid - 1;
            }
        }
        return celling;

    }


}
