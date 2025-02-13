package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

class FindMinimumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];
        System.out.println("Nhập các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int minValue = array[0];
        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}