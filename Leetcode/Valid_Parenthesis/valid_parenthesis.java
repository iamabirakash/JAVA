package Leetcode.Valid_Parenthesis;

import java.util.Stack;

public class valid_parenthesis {
    // Function to check if the parentheses are balanced
    public static boolean areParenthesesBalanced(String expr) {
        // Using a stack to keep track of opening parentheses
        Stack<Character> stack = new Stack<>();

        // Traversing the expression
        for (int i = 0; i < expr.length(); i++) {
            char character = expr.charAt(i);

            // If the character is an opening parenthesis, push it to the stack
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            }
            // If the character is a closing parenthesis
            else if (character == ')' || character == ']' || character == '}') {
                // Check if the stack is empty (indicating an unmatched closing parenthesis)
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char top = stack.pop();

                // Check if the popped element matches the current closing parenthesis
                if ((character == ')' && top != '(') ||
                    (character == ']' && top != '[') ||
                    (character == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses were matched; otherwise, they are unbalanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{()}[]";

        if (areParenthesesBalanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
