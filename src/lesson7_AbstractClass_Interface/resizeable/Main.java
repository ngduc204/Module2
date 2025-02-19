package lesson7_AbstractClass_Interface.resizeable;

public class Main {
    public static void main(String[] args) {
        testResizeable();
    }

    public static void testResizeable() {
        Circle circle = new Circle(10);
        circle.resize(50); // Tăng kích thước lên 50%
        System.out.println("Circle area after resizing: " + circle.getArea()); // Kiểm tra diện tích

        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.resize(25); // Tăng kích thước lên 25%
        System.out.println("Rectangle area after resizing: " + rectangle.getArea());

        Square square = new Square(5);
        square.resize(100); // Tăng kích thước lên 100%
        System.out.println("Square area after resizing: " + square.getArea());
    }
}