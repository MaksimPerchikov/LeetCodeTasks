package test;

import java.util.Arrays;
import java.util.List;
import main.java.tasks.mergeTwoSortList.ListNode;
import main.java.tasks.mergeTwoSortList.MergeTwoSortedLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    @Before
    public void setUp(){
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void testFirst(){
        ListNode first = new ListNode(4, null);
        ListNode second = new ListNode(2, first);
        ListNode third = new ListNode(1, second);

        ListNode first2 = new ListNode(4, null);
        ListNode second2 = new ListNode(3, first2);
        ListNode third2 = new ListNode(1, second2);

        int [] array = {1,1,2,3,4,4};
        int[] ints = mergeTwoSortedLists.mergeTwoLists(third, third2);
        Assert.assertArrayEquals(array, ints);
    }

}
