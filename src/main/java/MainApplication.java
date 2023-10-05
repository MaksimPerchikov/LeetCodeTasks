package main.java;

import java.util.Arrays;
import main.java.tasks.TwoSumArray;

public class MainApplication {

    public static void main(String[] args) {
        TwoSumArray twoSumArray = new TwoSumArray();
        int [] array1 = {2,7,11,15}; int[] ints1 = twoSumArray.twoSum(array1, 9); System.out.println(Arrays.toString(ints1));
    }

}
