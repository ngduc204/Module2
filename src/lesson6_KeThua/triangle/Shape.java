package lesson6_KeThua.triangle;

import java.util.Scanner;

public class Shape {
    private String color;

    public Shape() {
        this.color = "undefined";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape color: " + color;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3, color);

        System.out.println(triangle.toString());

        scanner.close();
    }
}