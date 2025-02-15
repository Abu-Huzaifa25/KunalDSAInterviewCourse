package DSAInterviewCourse.video.v13_linearSearchAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        int target = 7;

//        int ans = linearSearch(arr, target);
//        int ans = linearSearchII(arr, target);
//        boolean ans = linearSearchIII(arr, target);
        int ans = linearSearchIV(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (element == target ){
                return arr[i];
            }
        }
        return -1;
    }

    // Linear Search using For-Each Loop
    static int linearSearchII(int [] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int er : arr){
            if (er == target){
                return target;
            }
        }
        return -1;
    }

    // Linear Search using For-Loop and ReturnType Boolean

    static boolean linearSearchIII(int [] arr, int target){
        if (arr.length == 0){
            return false;
        }

        for (int e : arr){
            if (e == target){
                return true;
            }
        }

        return false;
    }

    static int linearSearchIV(int[] arr, int target){
        if (arr.length == 0)return -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }
        return -1;
    }
}
