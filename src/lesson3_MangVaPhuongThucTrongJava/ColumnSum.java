package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.print("Nhập số cột (0 đến " + (cols - 1) + ") để tính tổng: ");
        int column = scanner.nextInt();
        if (column < 0 || column >= cols) {
            System.out.println("Cột không hợp lệ.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][column];
        }
        System.out.println("Tổng của cột " + column + " là: " + sum);
    }
}