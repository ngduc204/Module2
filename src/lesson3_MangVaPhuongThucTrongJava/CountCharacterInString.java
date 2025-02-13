package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

class CountCharacterInString {
    public static void main(String[] args) {
        String str = "hello world";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự bạn muốn đếm: ");
        char characterToCount = scanner.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == characterToCount) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + characterToCount + "' trong chuỗi là: " + count);
    }
}