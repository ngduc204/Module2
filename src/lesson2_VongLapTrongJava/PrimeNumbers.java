package lesson2_VongLapTrongJava;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to display: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }

        sc.close();
    }
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}