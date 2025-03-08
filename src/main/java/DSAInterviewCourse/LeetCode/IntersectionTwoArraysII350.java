package DSAInterviewCourse.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoArraysII350 {
    public static void main(String[] args) {

    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }
        }

        return new int[]{-1};
    }
}
