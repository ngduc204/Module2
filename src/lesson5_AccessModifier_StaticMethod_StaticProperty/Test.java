package lesson5_AccessModifier_StaticMethod_StaticProperty;

public class Test {
    private String name = "John";
    private String classes = "C02";
    public Test(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setName("Nguyễn Đức");
        test.setClasses("IBSK1D2");
        System.out.println(test);
    }
}
