package DSAInterviewCourse.LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class IntersectionTwoArrays349 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                    break;
                }
            }
        }
        int[] arr = new int[set.size()];
        int index = 0;
        for (int i : set) {
            arr[index++] = i;
        }
        return arr;
    }
}
