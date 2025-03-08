package DSAInterviewCourse.video.Linear_SearchAlgorithm;

public class SearchString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("Ans : " + findKthPositive(arr, 5));
    }

    public static int findKthPositive(int[] arr, int k) {
        int countMissingNumber = 0;
        int index = 0;
        for (int i = 1; i <= arr[arr.length - 1] + k; i++) {
            if(index < arr.length) {
                if (i != arr[index]) {
                    countMissingNumber++;
                } else {
                    index++;
                }
            } else {
                countMissingNumber++;
            }

            if (countMissingNumber == k) {
                return i;
            }
        }
        return -1;
    }
}
