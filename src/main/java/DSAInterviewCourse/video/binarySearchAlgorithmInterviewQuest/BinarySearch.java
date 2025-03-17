package DSAInterviewCourse.video.binarySearchAlgorithmInterviewQuest;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {3, 4, 7, 10, 15, 20, 25};

        int target = 10;
        int result = getBinarySearch(nums, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");

    }

    static int getBinarySearch(int[] arr, int target){
        int left = 0, right = arr.length-1;

        while (left <= right) {
                int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;

            if (arr[mid] > target) right = mid - 1;

            else left = mid + 1;
        }
        return -1;

    }


}

