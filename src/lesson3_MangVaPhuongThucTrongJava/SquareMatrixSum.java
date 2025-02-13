package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class SquareMatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông (n x n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("Tổng các phần tử trên đường chéo chính của ma trận là: " + diagonalSum);
    }
}