package main.java.tasks;

import java.util.HashMap;
import java.util.Map;

/**
 * Наиболее частое повторяющееся значения в массиве
 * <p>
 * Example 1 [3,2,3] Output 3
 * <p>
 * Example 2 [2,2,1,1,1,2,2] Output 2
 */

public class FrequentlyRepeatedElementFromArray {

    public int frequentlyRepeatedElement(int[] nums) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        putAllValuesArrayFromMap(resultMap, nums);
        Map<Integer, Integer> finalMap = new HashMap<>(resultMap);
        for (int num : nums) {
            if (resultMap.size() == 0) {
                resultMap.put(nums[0], 1);
            } else {
                searchElementFromMap(resultMap, num, finalMap);
            }
        }
        return searchMaxNumberValueFormMap(finalMap);
    }

    private void putAllValuesArrayFromMap(Map<Integer, Integer> map, int[] nums) {
        for (int num : nums) {
            map.put(num, 0);
        }
    }

    private void searchElementFromMap(Map<Integer, Integer> resultMap,
        int key,
        Map<Integer, Integer> finalMap) {
        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            Integer searchKey = entry.getKey();
            if (searchKey == key) {
                Integer value = finalMap.get(key);
                Integer resultValue = value + 1;
                finalMap.put(key, resultValue);
                System.out.println("Добавлено значение: " + resultValue + "по ключу: " + key);
            }
        }
    }

    private int searchMaxNumberValueFormMap(Map<Integer, Integer> finalMap) {
        int maxNumber = 0;//здесь можно подставить наименьшее число, которое возможно мб в массиве
        int keyMaxNumber = 0;// ключ наибольшего значения
        for (Map.Entry<Integer, Integer> entry : finalMap.entrySet()) {
            if (maxNumber < entry.getValue()) {
                maxNumber = entry.getValue();
                keyMaxNumber = entry.getKey();
            }
        }
        return keyMaxNumber;
    }
}
