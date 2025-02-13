package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần xóa: ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                System.out.println("Phần tử " + X + " được tìm thấy tại vị trí " + index_del + ".");
                break;
            }
        }

        if (index_del != -1) {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
        } else {
            System.out.println("Phần tử " + X + " không có trong mảng.");
        }

        System.out.print("Mảng sau khi xóa phần tử: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}