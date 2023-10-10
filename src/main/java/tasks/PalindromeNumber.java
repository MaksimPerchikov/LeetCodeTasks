package main.java.tasks;

public class PalindromeNumber {

    public boolean palindromeNumber(int number) {

        String stringNumber = String.valueOf(number);
        char[] chars = stringNumber.toCharArray();
        char[] result = new char[chars.length];
        while (true) {
            int count = 0;
            int length = chars.length;
            for (int j = length - 1; j < length; j--) {
                char head = chars[count];
                char tail = chars[j];
                result[count] = tail;
                result[j] = head;
                count++;
                if (count > length / 2) {
                    break;
                }
            }
            break;
        }
        return comparisonArrays(chars, result);
    }

    public boolean comparisonArrays(char[] first, char[] second) {
        String firstString = String.valueOf(first);
        String secondString = String.valueOf(second);
        return firstString.equals(secondString);
    }
}
