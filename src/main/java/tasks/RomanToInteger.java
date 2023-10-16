package main.java.tasks;

public class RomanToInteger {

    public int romanToInt(String s) {

        String I = "I";//1
        String V = "V";//5
        String X = "X";//10
        String L = "L";//50
        String C = "C";//100-
        String D = "D";//500-
        String M = "M";//1000-
        String IV = "IV";//4-
        String IX = "IX";//9-
        String XL = "XL";//40-
        String XC = "XC";//90-
        String CD = "CD";//400-
        String CM = "CM";//900-
        int result = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char elementI = chars[i];
            int count = i + 1;
            if (count < chars.length) {
                if (elementI == 'C' && chars[i + 1] == 'D') {
                    result = result + 400;
                    i++;
                } else if (elementI == 'C' && chars[i + 1] == 'M') {
                    result = result + 900;
                    i++;
                } else if (elementI == 'M') {
                    result = result + 1000;
                } else if (elementI == 'X' && chars[i + 1] == 'C') {
                    result = result + 90;
                    i++;
                } else if (elementI == 'X' && chars[i + 1] == 'L') {
                    result = result + 40;
                    i++;
                } else if (elementI == 'I' && chars[i + 1] == 'V') {
                    result = result + 4;
                    i++;
                } else if (elementI == 'I' && chars[i + 1] == 'X') {
                    result = result + 9;
                    i++;
                } else if (elementI == 'L') {
                    result = result + 50;
                } else if (elementI == 'D') {
                    result = result + 500;
                } else if (elementI == 'C') {
                    result = result + 100;
                } else if (elementI == 'X') {
                    result = result + 10;
                } else if (elementI == 'V') {
                    result = result + 5;
                } else {
                    result = result + 1;
                }
            } else {
                if (elementI == 'M') {
                    result = result + 1000;
                } else if (elementI == 'D') {
                    result = result + 500;
                } else if (elementI == 'C') {
                    result = result + 100;
                } else if (elementI == 'L') {
                    result = result + 50;
                } else if (elementI == 'X') {
                    result = result + 10;
                } else if (elementI == 'V') {
                    result = result + 5;
                }else {
                    result = result + 1;
                }
            }
        }
        return result;
    }
}
