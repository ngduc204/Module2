package lesson7_AbstractClass_Interface.colorable;

public class Main {
    public static void main(String[] args) {
        testColorable();
    }

    public static void testColorable() {
        Square square = new Square(5);
        System.out.println("How to color the square: " + square.howToColor());
    }
}
