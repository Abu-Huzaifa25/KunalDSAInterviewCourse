package DSAInterviewCourse.video.v15_binarySearchAlgorithmInterviewQuest;

public class BinarySearch2D {
    public static void main(String[] args) {

        int[][] arr = {
                {4, 5, 6, 7,},
                {5, 9, 11, 23}
        };

        System.out.println(binarySearch(arr, 11));
    }

    static int binarySearch(int[][] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end ){
            int mid = start + ( end - start )/2;

            if (arr[start][mid] == target ){
                return arr[start][mid];
            }else if (arr[start][mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }


        return -1;
    }
}
