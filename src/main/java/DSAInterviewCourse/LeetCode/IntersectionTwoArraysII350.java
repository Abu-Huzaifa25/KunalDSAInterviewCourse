package DSAInterviewCourse.LeetCode;

import java.util.*;

public class IntersectionTwoArraysII350 {
    public static void main(String[] args) {
        int[] nums1 = {0,1,1,3,2,0};
        int[] nums2 = {1,1,2,1};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int [] feq = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int e : nums1){
            feq[e] = feq[e] + 1;
        }
        for(int e : nums2){
            if(feq[e] != 0){
                list.add(e);
                feq[e] = feq[e] - 1;
            }
        }
        int [] arr = new int[list.size()];

        for(int i= 0 ; i < list.size() ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
