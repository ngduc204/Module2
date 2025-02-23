package lesson9_AutomatedTesting_TDD.triangle;

public class TriangleClassifier {
    public static String classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "không phải tam giác";
        }
        if (a == b && b == c) {
            return "tam giác đều";
        }
        if (a == b || b == c || a == c) {
            return "tam giác cân";
        }
        return "tam giác thường";
    }
}
