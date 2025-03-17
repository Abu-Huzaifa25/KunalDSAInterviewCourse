package DSAInterviewCourse.video.binarySearchAlgorithm;

public class Findlargenumebr {
    public static void main(String[] args) {

        int[] nums = {2, 4, 70, 10, 15, 20,99, 25};

        int result = largeNum(nums);
        System.out.println("large Num: " + result);

    }

    static int largeNum(int[] numArr){

        int l = numArr[0];

        for (int i =0; i < numArr.length; i++){
            if (numArr[i] > l){
                l = numArr[i];
            }
        }

        return l;
    }
}
