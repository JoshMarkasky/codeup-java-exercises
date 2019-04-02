package shapes;

public class Square extends Quadrilateral {

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }

    public double getPerimeter(double length, double width) {
        return (length * 2) + (width * 2);
    }


    public double getArea(double length, double width) {
        return length * width;
    }
}
