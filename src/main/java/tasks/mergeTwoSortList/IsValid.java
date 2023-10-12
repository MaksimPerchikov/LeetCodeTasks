package main.java.tasks.mergeTwoSortList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class IsValid {

    public boolean isValidMethod(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (Character c: chars) {
            if (c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            }
            else if (c ==']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            }
            else if (c =='}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}





















    /*Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')' && !stack.empty() && stack.peek() == '(') {//stack.peek взять последний элемент
            stack.pop();//удалить последний элемент
            } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
            stack.pop();
            } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
            stack.pop();
            } else {
            stack.push(c);// добавить элемент в стек
            }
            }
            return stack.empty();*/