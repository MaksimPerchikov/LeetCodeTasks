package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import main.java.tasks.FrequentlyRepeatedElementFromArray;
import main.java.tasks.TwoSumArray;

public class MainApplication {

    public static void main(String[] args) {
        TwoSumArray twoSumArray = new TwoSumArray();
        int [] array1 = {2,7,11,15}; int[] ints1 = twoSumArray.twoSum(array1, 9); System.out.println(Arrays.toString(ints1));
        int [] array2 = {1,2,3,1,2,2};
        FrequentlyRepeatedElementFromArray fromArray = new FrequentlyRepeatedElementFromArray();
        int result = fromArray.frequentlyRepeatedElement(array2);
        System.out.println(result);
    }

}
