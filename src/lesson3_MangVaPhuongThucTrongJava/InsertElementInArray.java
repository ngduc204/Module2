package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Nhập số cần chèn: ");
        int X = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn X (0 đến " + N + "): ");
        int index = scanner.nextInt();
        if (index < 0 || index > N) {
            System.out.println("Không thể chèn được phần tử vào mảng.");
        } else {
            int[] newArray = new int[N + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = X;
            for (int i = index; i < N; i++) {
                newArray[i + 1] = array[i];
            }
            array = newArray;
        }

        System.out.print("Mảng sau khi chèn phần tử: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}