package lesson13_ThuatToanTimKiem;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String removeDuplicates(String input) {
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (output.indexOf(String.valueOf(c)) == -1) {
                output.append(c);
            }
        }

        return output.toString();
    }
}