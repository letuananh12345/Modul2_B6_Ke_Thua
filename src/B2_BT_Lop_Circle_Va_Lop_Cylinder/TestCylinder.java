package B2_BT_Lop_Circle_Va_Lop_Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Volume is: "+cylinder.getVolume());
        System.out.println();

        cylinder = new Cylinder(5);
        System.out.println(cylinder);
        System.out.println("Volume is: "+cylinder.getVolume());
        System.out.println();

        cylinder = new Cylinder(3.8,"blue",10);
        System.out.println(cylinder);
        System.out.println("Volume is: "+cylinder.getVolume());

    }
}
