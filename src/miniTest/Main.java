package miniTest;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien quanLy = new QuanLyNhanVien();

        // Thêm nhân viên
        quanLy.addEmployee(new NhanVienFulltime(1, "Nguyen Minh Duc", 21, "0343 883 833", "ngduchd204@gmail.com", 5000000, 500000, 1000000));
        quanLy.addEmployee(new NhanVienFulltime(2, "Nguyen Minh Duc", 21, "0343 883 833", "ngduchd204@gmail.com", 500000, 6000, 500000));
        quanLy.addEmployee(new NhanVienFulltime(3, "Nguyen Minh Duc", 21, "0343 883 833", "ngduchd204@gmail.com", 100000, 55000, 7000000));
        quanLy.addEmployee(new NhanVienFulltime(4, "Nguyen Minh Duc", 21, "0343 883 833", "ngduchd204@gmail.com", 40000, 80000, 8000000));
        quanLy.addEmployee(new NhanVienParttime(5, "Le Son Nhat", 25, "0987654321", "lenhat@gmail.com", 12));

        // 5: Viết phương thức tính trung bình lương của nhân viên cả công ty..
        System.out.println("Lương trung bình: " + quanLy.calculateAverageSalary());

        // 6: Viết phương thức liệt kê danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty.
        System.out.println("Nhân viên toàn thời gian lương thấp: " + quanLy.getLowSalaryFulltimeEmployees());

        // 7: Viết phương thức tính số lương phải trả cho tất cả các nhân viên bán thời gian.
        System.out.println("Tổng lương nhân viên bán thời gian: " + quanLy.getTotalParttimeSalary());

        // 8: Viết phương thức sắp xếp nhân viên toàn thời gian theo số lương tăng dần.
        System.out.println("Danh sách nhân viên toàn thời gian theo lương: " + quanLy.sortFulltimeEmployeesBySalary());

        // 9. Viết phương thức tìm kiếm nhân viên theo tên.
        System.out.println("Tìm kiếm nhân viên: " + quanLy.findEmployeeByName("Nguyen Minh Duc"));
    }
}
