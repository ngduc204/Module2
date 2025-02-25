package lesson11_DSA_Stack_Queue;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}