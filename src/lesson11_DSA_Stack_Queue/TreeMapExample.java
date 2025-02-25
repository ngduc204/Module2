package lesson11_DSA_Stack_Queue;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng cặp key-value:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập key (số nguyên):");
            int key = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập value (chuỗi):");
            String value = scanner.nextLine();

            if (treeMap.containsKey(key)) {
                System.out.println("Key " + key + " đã tồn tại. Vui lòng nhập key khác.");
                i--;
            } else {
                treeMap.put(key, value);
            }
        }

        System.out.println("\nCác cặp key-value trong TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        scanner.close();
    }
}