package lesson7_AbstractClass_Interface.resizeable;

public class ShapeTest {
    public static void main(String[] args) {
        testCircleResize();
        testRectangleResize();
        testSquareResize();
    }

    public static void testCircleResize() {
        Circle circle = new Circle(10);
        circle.resize(50);
        double expectedArea = Math.PI * 15 * 15; // Diện tích mong đợi
        double actualArea = circle.getArea();
        System.out.println("Circle test " + (Math.abs(expectedArea - actualArea) < 0.01 ? "passed" : "failed"));
    }

    public static void testRectangleResize() {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.resize(25);
        double expectedArea = 12.5 * 25; // Diện tích mong đợi
        double actualArea = rectangle.getArea();
        System.out.println("Rectangle test " + (Math.abs(expectedArea - actualArea) < 0.01 ? "passed" : "failed"));
    }

    public static void testSquareResize() {
        Square square = new Square(5);
        square.resize(100);
        double expectedArea = 10 * 10; // Diện tích mong đợi
        double actualArea = square.getArea();
        System.out.println("Square test " + (Math.abs(expectedArea - actualArea) < 0.01 ? "passed" : "failed"));
    }
}