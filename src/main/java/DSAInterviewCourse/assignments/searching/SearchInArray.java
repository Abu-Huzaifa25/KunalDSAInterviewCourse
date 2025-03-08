package DSAInterviewCourse.assignments.searching;

public class SearchInArray {
    public static void main(String[] args) {

        int[] arr = {18, 12, 9, 14, 77, 50};
        int tar = 12;
        System.out.println(search(arr,tar));
    }

    public static boolean search(int [] arr, int target ){

        if (arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
