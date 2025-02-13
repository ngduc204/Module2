package lesson3_MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String input = sc.nextLine();
        boolean isExits = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input)) {
                System.out.println("Position of the students in the list: " + input + "is " + i);
                isExits = true;
                break;
            }
        }
        if (!isExits) {
            System.out.println("Not found" + input + " in the list!");
        }
    }
}
