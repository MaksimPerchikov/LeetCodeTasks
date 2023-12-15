package main.java.tasks;

public class LongestCommonPrefix {


    public String longPrefix(String[] strs) {
        StringBuilder result = new StringBuilder("");
        String mainStr = strs[0];
        final char[] chars = mainStr.toCharArray();
        boolean test = false;
        for (int i = 0; i < chars.length; i++) {
            String mainStrElement = String.valueOf(chars[i]);
            for (int j = 1; j < strs.length; j++) {
                String currentString = strs[j];
                final char[] currentChars = currentString.toCharArray();
                if(currentChars.length == 0){
                    return "";
                }
                for (int k = 0; k < currentChars.length; k++) {
                    int currentCharsLength = currentChars.length;
                    if (i >= currentCharsLength) {
                        return result.toString();
                    }
                    String currentStrElement = String.valueOf(currentChars[i]);
                    if (!mainStrElement.equals(currentStrElement)) {
                        test = true;
                    }
                }
            }
            if (test) {
                return result.toString();
            } else {
                result.append(mainStrElement);
            }
        }
        return result.toString();
    }

}
