package B1_TH_He_Cac_Doi_Tuong_Hinh_Hoc;

public class Circle extends Shape {
    private double radius=-1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius * Math.PI;
    }
    public double getPerimeter(){
        return  radius*2* Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with rad "
                +getRadius()
                +", which is a subclass of "
                + super.toString();
    }


}
