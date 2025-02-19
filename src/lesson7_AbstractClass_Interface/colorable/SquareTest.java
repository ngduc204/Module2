package lesson7_AbstractClass_Interface.colorable;

public class SquareTest {
    public static void main(String[] args) {
        testSquare();
    }

    public static void testSquare() {
        Square square = new Square(5);
        String expected = "Color all four sides.";
        String actual = square.howToColor();
        System.out.println("Square test " + (expected.equals(actual) ? "passed" : "failed"));
    }
}
