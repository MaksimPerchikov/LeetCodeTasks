package main.java.tasks;

import java.util.Scanner;

/**
 * Обычная проверка на знания IfElse
 */
public class SolutionIfElse {

    private final Scanner scanner = new Scanner(System.in);
    private final String WEIRD = "Weird";
    private final String NOT_WEIRD = "Not Weird";

    private void showMeResult(String message) {
        System.out.println(message);
    }

    public void inputNumber() {
        int number = scanner.nextInt();
        solutionIfElse(number);
    }

    public String solutionIfElse(int number) {
        if (number % 2 > 0) {
            showMeResult(WEIRD);
            return WEIRD;
        } else if (number > 20) {
            showMeResult(NOT_WEIRD);
            return NOT_WEIRD;
        } else if (number % 2 == 0 && (number >= 6 && number <= 20)) {
            showMeResult(WEIRD);
            return WEIRD;
        } else if (number % 2 == 0 && (number >= 2 && number <= 5)) {
            showMeResult(NOT_WEIRD);
            return NOT_WEIRD;
        }
        return "Number not search";
    }
//нечетные Weird
//четное и в диапазоне от 2 до 5 Not Weird
//если четное и в диапазоне от 6 до 20 Weird
//если четное и больше 20 Not Weird


}
