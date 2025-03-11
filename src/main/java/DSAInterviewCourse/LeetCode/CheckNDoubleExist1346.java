package DSAInterviewCourse.LeetCode;

public class CheckNDoubleExist1346 {
    public static void main(String[] args) {

        int []  arr = {10,2,3,3};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

        for ( int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr.length; j++){
                if (i == j ){
                    continue;
                } else if (arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;

    }
}
