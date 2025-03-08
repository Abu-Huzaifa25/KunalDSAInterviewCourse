package DSAInterviewCourse.video.Linear_SearchAlgorithm;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {4,5,6,18,3,4,5};
        int target = 18;
        int result = linearSearch(arr, 2, 5, target);

        System.out.println(result);

    }

    // linear Search in range A to B with for loop
    public static int linearSearch(int[] arr , int start, int end, int target){
        if (arr.length == 0)return -1;

        for (int index = start; index < end; start++ ){
            int presentedElement = arr[start];
            if (presentedElement == target){
                return presentedElement;
            }
        }

        return -1;
    }


}
