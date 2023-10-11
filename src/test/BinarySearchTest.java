package test;

import main.java.tasks.mergeTwoSortList.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Before
    public void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    public void firstTest() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        Assert
            .assertEquals(4, binarySearch.search(nums, target));
    }

    @Test
    public void secondTest() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        Assert
            .assertEquals(-1, binarySearch.search(nums, target));
    }
}
