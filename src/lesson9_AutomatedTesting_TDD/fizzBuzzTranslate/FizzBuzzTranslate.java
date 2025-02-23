package lesson9_AutomatedTesting_TDD.fizzBuzzTranslate;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number <= 0) {
            return "không hợp lệ";
        }

        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 26 == 0) {
            result += "hai sau";
        }

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}