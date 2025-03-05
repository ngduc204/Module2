package focus.exercise;

import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100000;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(1000000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        System.out.println("Thời gian thực thi: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}
