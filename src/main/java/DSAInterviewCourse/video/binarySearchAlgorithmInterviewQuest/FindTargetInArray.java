package DSAInterviewCourse.video.v15_binarySearchAlgorithmInterviewQuest;

public class FindTargetInArray {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 7, 8, 11};
        System.out.println(binarySearch(arr, 8));

        int result = getIndexWithBinarySearch(arr, 7);
        if ( result != -1){
            System.out.println("Index found " + result);
        }else {
            System.out.println("Index not found "+ result);
        }
    }


    static int binarySearch(int [] arr, int target){

       int start = 0;
       int end = arr.length-1;

       while (start <= end){
           int mid = start + ( end - start) / 2;

           if (arr[mid] == target){
               return arr[mid];
           } else if (arr[mid] < target) { // If mid is less than the target [ mid < target ]
               start = mid + 1;
           }else {
               end = mid - 1;
           }
       }
       return -1;
    }

    static int getIndexWithBinarySearch(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int index = s + ( e - s )/ 2;
            if (arr[index] == target ){
                return index; // m == mid
            } else if (arr[s] < target) {
                s = index + 1;
            }else {
                e = index - 1;
            }
        }
        return -1;
    }
}
