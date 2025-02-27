package lesson13_ThuatToanTimKiem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Nhap so luong phan tu toi da cua mang: ");
        int input = sc.nextInt();
        int[] array = new int[input];
        for (int i = 0; i < array.length; i++) {
            int random = rd.nextInt(10);
            array[i] = random;
        }
        System.out.println("Mang ban dau: "+ Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Mang tang dan: "+ Arrays.toString(array));
    }
}
