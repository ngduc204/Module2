package lesson7_AbstractClass_Interface.colorable;

public class Square implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String howToColor() {
        return "Color all four sides.";
    }

    public double getArea() {
        return side * side;
    }
}
