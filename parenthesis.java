// Requirements-
/*
Input: The input is a string s containing only the characters '(', ')', '{', '}', '[' and ']'.
Output: The function should return a boolean value, true if the input string is valid according to the specified conditions, and false otherwise.
Valid String Definition:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
String Length: The length of the input string can vary.
*/

import java.util.Stack;
public class parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if ((c == ')' && openBracket != '(') ||
                        (c == ']' && openBracket != '[') ||
                        (c == '}' && openBracket != '{')) {
                    return false; // Mismatched open and close brackets
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "()[]{}";
        String input2 = "(]";

        System.out.println("Input: " + input1 + "  Output: " + isValid(input1));
        System.out.println("Input: " + input2 + "  Output: " + isValid(input2));
    }
}

