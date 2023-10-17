package main.java.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        convert(nums1, list);
        convert(nums2, list);
        Collections.sort(list);
        int size = list.size();
        if (size % 2 == 0) {
            int firstPosition = size / 2 - 1;
            Integer firstNumberFinal = list.get(firstPosition);
            Integer secondNumberFinal = list.get(firstPosition + 1);
            return  (firstNumberFinal + secondNumberFinal) / 2.00000;
        }else return list.get((int) ((size / 2) + 0.5));
    }

    public void convert(int[] nums, List<Integer> list) {
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
    }
}
