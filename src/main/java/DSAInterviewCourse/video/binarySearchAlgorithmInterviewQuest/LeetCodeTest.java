package DSAInterviewCourse.video.v15_binarySearchAlgorithmInterviewQuest;

public class LeetCodeTest {
    public static void main(String[] args) {

        String str = "1.1.1.1";
        System.out.println(defangIPaddr(str));

    }
    static String defangIPaddr(String address) {
        String [] arr = new String[address.length()];

        String add = "";
        for (int i = 0; i < arr.length; i++){
            arr[i] = String.valueOf(address.charAt(i));
            if (address.charAt(i) == '.'){
                add +=  "[" + arr[i] + "]";

            }else {
                add +=  arr[i];
            }
        }

        return add;

    }
}
