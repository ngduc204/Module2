package lesson4_LopVaDoiTuongTrongJava;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * 2 - 4 * this.a * this.c;
    }

    // Phương thức để tìm nghiệm
    public double[] getRoots() {
        double delta = getDiscriminant();
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return null; // Không có nghiệm
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double[] roots = equation.getRoots();
        if (roots == null) {
            System.out.println("The equation has no roots.");
        } else if (roots.length == 1) {
            System.out.printf("Có một nghiệm: x = %.2f%n", roots[0]);
        } else {
            System.out.printf("Có hai nghiệm: x1 = %.2f, x2 = %.2f%n", roots[0], roots[1]);
        }
    }
}
