package B1_TH_He_Cac_Doi_Tuong_Hinh_Hoc;

public class Retangle extends Shape {
    private double width = 1.0;
    private  double lenght = 1.0;

    public Retangle() {
    }

    public Retangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Retangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }
    public double getArea() {
        return width * this.lenght;
    }

    public double getPerimeter() {
        return 2 * (width + this.lenght);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    @Override
    public String toString(){
        return  "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLenght()
                + ", which is a subclass of "
                + super.toString();
    }
}
