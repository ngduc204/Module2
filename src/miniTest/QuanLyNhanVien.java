package miniTest;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien {
    private List<NhanVien> nhanViens;

    public QuanLyNhanVien() {
        this.nhanViens = new ArrayList<>();
    }

    public void addEmployee(NhanVien nv) {
        nhanViens.add(nv);
    }

    public double calculateAverageSalary() {
        double totalSalary = 0;
        int count = 0;

        for (int i = 0; i < nhanViens.size(); i++) {
            NhanVien nv = nhanViens.get(i);
            if (nv instanceof NhanVienFulltime) {
                totalSalary += ((NhanVienFulltime) nv).calculateSalary();
                count++;
            } else if (nv instanceof NhanVienParttime) {
                totalSalary += ((NhanVienParttime) nv).calculateSalary();
                count++;
            }
        }
        return count == 0 ? 0 : totalSalary / count;
    }

    public List<NhanVienFulltime> getLowSalaryFulltimeEmployees() {
        double averageSalary = calculateAverageSalary();
        List<NhanVienFulltime> lowSalaryEmployees = new ArrayList<>();

        for (int i = 0; i < nhanViens.size(); i++) {
            NhanVien nv = nhanViens.get(i);
            if (nv instanceof NhanVienFulltime) {
                if (((NhanVienFulltime) nv).calculateSalary() < averageSalary) {
                    lowSalaryEmployees.add((NhanVienFulltime) nv);
                }
            }
        }
        return lowSalaryEmployees;
    }

    public double getTotalParttimeSalary() {
        double totalSalary = 0;

        for (int i = 0; i < nhanViens.size(); i++) {
            NhanVien nv = nhanViens.get(i);
            if (nv instanceof NhanVienParttime) {
                totalSalary += ((NhanVienParttime) nv).calculateSalary();
            }
        }
        return totalSalary;
    }

    public List<NhanVienFulltime> sortFulltimeEmployeesBySalary() {
        List<NhanVienFulltime> fulltimeEmployees = new ArrayList<>();

        for (int i = 0; i < nhanViens.size(); i++) {
            NhanVien nv = nhanViens.get(i);
            if (nv instanceof NhanVienFulltime) {
                fulltimeEmployees.add((NhanVienFulltime) nv);
            }
        }

        fulltimeEmployees.sort((nv1, nv2) -> Double.compare(nv1.calculateSalary(), nv2.calculateSalary()));
        return fulltimeEmployees;
    }

    public NhanVien findEmployeeByName(String name) {
        for (int i = 0; i < nhanViens.size(); i++) {
            NhanVien nv = nhanViens.get(i);
            if (nv.getName().equalsIgnoreCase(name)) {
                return nv;
            }
        }
        return null;
    }
}
