package lesson1_IntroductionToJava;

import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        double vndRate = 25000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = sc.nextDouble();
        double vnd = vndRate * usd;
        System.out.println(usd + "$ chuyển đổi sang VNĐ:" + vnd);
    }
}
