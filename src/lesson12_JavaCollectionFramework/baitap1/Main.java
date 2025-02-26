package lesson12_JavaCollectionFramework.baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn thao tác:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Tìm sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá");
            System.out.println("6. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sản phẩm: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng trống
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    productManager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập ID sản phẩm cần xóa: ");
                    int removeId = scanner.nextInt();
                    productManager.removeProduct(removeId);
                    break;
                case 3:
                    System.out.print("Nhập ID sản phẩm cần tìm: ");
                    int findId = scanner.nextInt();
                    Product foundProduct = productManager.findProduct(findId);
                    if (foundProduct != null) {
                        System.out.println("Sản phẩm tìm thấy: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm:");
                    for (Product product : productManager.getAllProducts()) {
                        System.out.println(product);
                    }
                    break;
                case 5:
                    productManager.sortProducts();
                    System.out.println("Sản phẩm đã được sắp xếp theo giá.");
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
