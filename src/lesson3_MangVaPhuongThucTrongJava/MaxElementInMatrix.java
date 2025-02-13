package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

class MaxElementInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ của giá trị lớn nhất là: hàng " + (maxRow + 1) + ", cột " + (maxCol + 1));
    }
}