package miniTest;

public class NhanVienParttime extends NhanVien {
    private int workingHours;

    public NhanVienParttime(int id, String name, int age, String phoneNumber, String email, int workingHours) {
        super(id, name, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double calculateSalary() {
        return workingHours * 100000;
    }

    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "workingHours=" + workingHours +
                ", salary=" + calculateSalary() +
                '}';
    }
}