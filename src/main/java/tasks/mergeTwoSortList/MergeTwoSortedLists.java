package main.java.tasks.mergeTwoSortList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task 5 / Объединить два отсортированных списка
 */

public class MergeTwoSortedLists {


    public /*ListNode*/int[] mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> result = new ArrayList<>();
        int[] extracted = extracted(list1, list2, result);
        return extracted;
    }

    private /*ListNode*/int[] extracted(ListNode list1, ListNode list2, List<Integer> result) {
        result.add(list1.val);
        getAllValueFromListNode(list1.next, result);
        result.add(list2.val);
        getAllValueFromListNode(list2.next, result);
        System.out.println(result);
        ListNode listNode = convertListIntegerInListNode(
            sortedElements(result)
        );
        List<Integer> finalList = new ArrayList<>();
        return getAllElementsInArrayFormat(listNode, size(listNode, new LinkedList<>()), finalList);
    }

    private ListNode convertListIntegerInListNode(List<Integer> list) {
        ListNode prev = null;
        for (int i = list.size() - 1; i >= 0; i--) {
            prev = new ListNode(list.get(i), prev);
        }
        return prev;
    }

    public List<Integer> sortedElements(List<Integer> result) {
        return result.stream()
            .sorted()
            .collect(Collectors.toList());
    }


    public void getAllValueFromListNode(ListNode listNode, List<Integer> result) {
        int count = 0;
        if (listNode.next != null) {
            int value = listNode.val;
            result.add(value);
            getAllValueFromListNode(listNode.next, result);
        }
        if (listNode.next == null) {
            result.add(listNode.val);
        }
        /*if (listNode.next == null
            && count == 0) {//чтобы последнее значение вытащить, у которого следующий за ним узел равен null
            int value = listNode.val;
            result.add(value);
            count = count + 1;
        }*/
    }

    public int size(ListNode listNode, List<Integer> list) {
        boolean stop = false;
        if (listNode.next != null) {
            list.add(listNode.val);
            size(listNode.next, list);
        }

        if (listNode.next == null) {
            list.add(listNode.val);
        }
        return list.size();
    }

    public int[] getAllElementsInArrayFormat(ListNode listNode, int size, List<Integer> finalList) {
        int count = 0;
        if (listNode.next != null) {
            int val = listNode.val;
            finalList.add(val);
            getAllElementsInArrayFormat(listNode.next, size, finalList);
        }
        if (listNode.next == null) {
            int val = listNode.val;
            finalList.add(val);
        }

        return finalList.stream()
            .mapToInt(Integer::intValue) // Преобразование в поток целых чисел
            .toArray();
    }

}