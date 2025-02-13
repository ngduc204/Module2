package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of num: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate / 100) / 12 * month;
            System.out.println("Total of interest: " + total);
        }
    }
}
