package model.logic;

import java.util.Stack;

public class SearchLogic {
    final static char[] OPEN_BRACKETS = new char[]{'{', '[', '('};
    final static char[] CLOSE_BRACKETS = new char[]{'}', ']', ')'};

    private static boolean isInArray(char symbol) {

        for (char openBracket : OPEN_BRACKETS) {
            if (openBracket == symbol)
                return true;
        }
        return false;
    }

    private static int indexOf(char symbol) {
        int index = -1;
        for (int i = 0; i < CLOSE_BRACKETS.length; i++) {
            if (CLOSE_BRACKETS[i] == symbol)
                index = i;
        }
        return index;
    }

    public static boolean brackets(String text) {
        if (text == null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (isInArray(symbol))
                stack.push(symbol);
            else {
                int index = indexOf(symbol);
                if (index != -1) {
                    if (stack.empty() || stack.pop() != OPEN_BRACKETS[index])
                        return false;
                }
            }
        }
        return stack.empty();
    }


}
