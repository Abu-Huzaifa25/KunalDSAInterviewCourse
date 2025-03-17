package DSAInterviewCourse.video.arraysAndArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(121);
//        list.add(122);
//        list.add(123);
//        list.add(124);
//        list.add(125);
//        System.out.println(list);
//
//        list.set(2, 556);
//        list.clear();
//        list.remove(3);
//        System.out.println(list);


        for (int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++){
            System.out.print(list.get(i) + " ");
        }


    }
}
