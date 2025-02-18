package lesson6_KeThua.point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return super.toString() + ", z: " + getZ();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(6, 7, 8);
        System.out.println(point3D.toString());
    }
}