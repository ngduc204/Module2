package lesson6_KeThua.circle_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(5.0, "blue", 10.0);
        System.out.println(cylinder.toString());
    }
}