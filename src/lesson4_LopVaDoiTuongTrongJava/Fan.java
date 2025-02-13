package lesson4_LopVaDoiTuongTrongJava;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = 1;
    private boolean isOn = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }
    public Fan(){
        this.speed = SLOW;
        this.isOn = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", isOn=" + isOn +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.FAST);
        fan2.setRadius(15.0);
        fan2.setColor("red");
        Fan fan3 = new Fan(Fan.MEDIUM, true, 15.0, "black");
        System.out.println(fan3);
    }
}
