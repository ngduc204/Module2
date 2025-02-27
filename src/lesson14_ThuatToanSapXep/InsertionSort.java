package lesson14_ThuatToanSapXep;

public class InsertionSort {

    public static void main(String[] args) {
        int[] list = {5, 2, 9, 1, 5, 6};

        System.out.println("Mảng ban đầu:");
        printArray(list);

        insertionSort(list);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int x = list[i];  // Lưu giá trị hiện tại
            int pos = i;      // Vị trí hiện tại

            // Di chuyển các phần tử lớn hơn x lên một vị trí
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // Di chuyển phần tử
                pos--;
            }
            list[pos] = x; // Chèn x vào vị trí thích hợp
        }
    }

    // Phương thức in mảng
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}