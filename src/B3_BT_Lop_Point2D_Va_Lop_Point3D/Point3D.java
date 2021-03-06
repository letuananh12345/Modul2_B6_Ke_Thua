package B3_BT_Lop_Point2D_Va_Lop_Point3D;

public class Point3D extends Point2D {
    private float z;

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
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {getX(),getY(),getZ()};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString()+", z = "+z;
    }
}
