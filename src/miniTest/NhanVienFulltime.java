package miniTest;

public class NhanVienFulltime extends NhanVien {
    private double bonus;
    private double fineAmount;
    private double baseSalary;

    public NhanVienFulltime(int id, String name, int age, String phoneNumber, String email, double bonus, double fineAmount, double baseSalary) {
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fineAmount = fineAmount;
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary + (bonus - fineAmount);
    }

    @Override
    public String toString() {
        return "NhanVienFulltime{" +
                "bonus=" + bonus +
                ", fineAmount=" + fineAmount +
                ", baseSalary=" + baseSalary +
                ", salary=" + calculateSalary() +
                '}';
    }
}