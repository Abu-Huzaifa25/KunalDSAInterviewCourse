package DSAInterviewCourse.GeeksForGeeks;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 10;

//        for (int i = 1; i <= 10; i++){
//            System.out.println( num +" * "+ i + " = " + num * i);
//        }

//        System.out.println(Arrays.toString(table(4)));
        System.out.println(Arrays.toString(intTable(4)));

    }

    public static String [] table(int nums){
        String [] results = new String[10];

        for (int i = 0; i < results.length; i++){
//            results[i] =  nums +" * "+ i + " = " + (nums * i);
            results[i] = nums + " * " + (i + 1) + " = " + (nums * (i + 1)) ;
        }
        return results;
    }

    public static int [] intTable(int n ){

        int [] results = new int[10];

        for (int i = 0; i < results.length; i++){
            results[i] = n * ( i + 1);

        }

        return results;
    }

}
