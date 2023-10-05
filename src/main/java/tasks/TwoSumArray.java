package main.java.tasks;

import java.util.Arrays;

public class TwoSumArray {

    /**
     * int [] array1 = {2,7,11,15}; int[] ints1 = twoSum(array1, 9); System.out.println(Arrays.toString(ints1));
     * Output: [0,1]
     * <p>
     * int[] array2 = {3, 2, 4}; int[] ints2 = twoSum(array2, 6); System.out.println(Arrays.toString(ints2));
     * Output: [1,2]
     * <p>
     * int[] array3 = {3,3}; int[] ints3 = twoSum(array3, 6); System.out.println(Arrays.toString(ints3));
     * Output: [0,1]
     */

    public int[] twoSum(int[] nums, int target) {
        int[] searchNumbers = new int[2];//найденные ЗНАЧЕНИЯ, которые в сумме дают 9(target)
        int[] result = new int[2];// результат, который должен содержать расположение этих найденных ЗНАЧЕНИЙ
        boolean running = false;// переменная, которая меняется на true, когда находятся нужные ЗНАЧЕНИЯ
        for (int i = 0; i < nums.length; i++) {
            int firstNumber = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int secondNumber = nums[j];

                int sum = firstNumber + secondNumber;
                if (sum == target && i != j) {
                    searchNumbers[0] = firstNumber;
                    searchNumbers[1] = secondNumber;
                    running = true;
                    break;
                }
                if (running) {
                    break;
                }
            }
        }
        //int [] resultSort = new int[2];
        //делаю сортировку по возрастанию на searchNumber (Пузырьком)
        bubbleSort(searchNumbers);
        if (running) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < searchNumbers.length;
                    j++) {//присваиваю позиции найденным ЗНАЧЕНИЯМ и заношу их в result
                    if (nums[i] == searchNumbers[j]) {
                        result[count] = i;
                        count++;
                        break;
                    }
                }
            }
        }
        return bubbleSort(result);
    }

    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int test = array[i];
                    array[i] = array[j];
                    array[j] = test;
                }
            }
        }
        return array;
    }
}
