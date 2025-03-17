package DSAInterviewCourse.video.v14_binarySearchAlgorithm;

public class FindSmallestNumber {
    public static void main(String[] args) {

        int[] nums = {2, 4, 7, 10, 15, 20, 25};

        int result = smallestNum(nums);
        System.out.println("Number : " + result);

    }

    static int smallestNum(int[] numArr){

        int l = numArr[0];
        for (int i =0; i < numArr.length; i++){

            if (numArr[i] < numArr[0]){
                l = numArr[i];
            }
        }

        return l;
    }
}
