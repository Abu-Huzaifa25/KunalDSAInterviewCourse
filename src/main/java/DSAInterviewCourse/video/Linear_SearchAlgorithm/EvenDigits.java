package DSAInterviewCourse.video.Linear_SearchAlgorithm;

public class EvenDigits {
    public static void main(String[] args) {

        int [] nums = { 12, 12, 14,667, 1};
        int result = findNumber(nums);
        System.out.println(result);

    }

    static int findNumber(int []arr){
        int count = 0;
        for (int e : arr){
            if (even(e)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
       int numberOfDigits = digits(nums);
       return numberOfDigits % 2 == 0;
    }


    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;

    }
}

