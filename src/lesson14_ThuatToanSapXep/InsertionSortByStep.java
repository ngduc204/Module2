package lesson14_ThuatToanSapXep;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\n\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int x = list[i];
            int pos = i;

            System.out.println("Inserting " + x + " into sorted portion...");
            while (pos > 0 && x < list[pos - 1]) {
                System.out.println("Moving " + list[pos - 1] + " to position " + pos);
                list[pos] = list[pos - 1]; // Di chuyển phần tử
                pos--;
            }
            list[pos] = x; // Chèn phần tử vào vị trí thích hợp

            System.out.print("List after inserting " + x + ": ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}