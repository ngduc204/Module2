package lesson6_KeThua.point2D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    Point2D() {
    }

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "x: " + getX() + ", y: " + getY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(11, 19);
        System.out.println(point2D.toString());
    }
}