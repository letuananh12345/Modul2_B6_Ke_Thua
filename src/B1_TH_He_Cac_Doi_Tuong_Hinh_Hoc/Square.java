package B1_TH_He_Cac_Doi_Tuong_Hinh_Hoc;

public class Square extends Retangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLenght(side);
    }

    public Square(double width, double lenght) {
        super(width, lenght);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of"
                +super.toString();
    }
}
