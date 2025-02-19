package lesson7_AbstractClass_Interface.resizeable;

public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }

    public double getArea() {
        return side * side;
    }
}
