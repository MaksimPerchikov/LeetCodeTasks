package test;

import main.java.tasks.MedianOfTwoSortedArrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays median;

    @Before
    public void setUp() {
        median = new MedianOfTwoSortedArrays();
    }

    @Test
    public void firstTest() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        Assert.assertEquals(2.0, median.findMedianSortedArrays(nums1, nums2), 1e-6);
    }

    @Test
    public void secondTest() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        Assert.assertEquals(2.5, median.findMedianSortedArrays(nums1, nums2), 1e-6);
    }

}
