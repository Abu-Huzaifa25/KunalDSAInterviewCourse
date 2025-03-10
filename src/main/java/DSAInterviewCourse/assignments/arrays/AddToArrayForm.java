package DSAInterviewCourse.assignments.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {
    public static void main(String[] args) {

        System.out.println(addToArray(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}, 516));
        // [1,2,3,4]
    }

    // error
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> outputList = new ArrayList<>();
        String numStr = "";
        for (int e : num) {
            numStr += String.valueOf(e);
        }
//        String ansStr = String.valueOf(Long.parseLong(numStr) + k);

        String ansStr = String.valueOf(new BigInteger(numStr).add(new BigInteger(String.valueOf(k))));
        for(char c : ansStr.toCharArray()){ // ['1','2']
            outputList.add(  Integer.parseInt( String.valueOf(c)));
        }


        return outputList;
    }

    // 1, 2, 0, 0 ==>  34
    static List<Integer>  addToArray (int[] num, int k){
        LinkedList<Integer> res = new LinkedList<>();

        int len = num.length-1;
        while (len >= 0 || k > 0){
            if (len >= 0){
                k += num[len--];
            }
            res.addFirst( k % 10);
            k /= 10;
        }
        return res;

    }
}
