package DSAInterviewCourse.video.v13_linearSearchAlgorithm;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7 , -8, 9, -1};
        int min = min(arr);
        int max = max(arr);

        System.out.println("Max number is : " + max);
    }

    public static int min(int [] arr){

        int ans = arr[0];

        for (int i = 1; i < arr.length ; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }

    public static int max(int [] arr){

        int ans = arr[0];

        for (int i = 1; i < arr.length ; i++){
            if (arr[i] > ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
