package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    public double setLength() {
        return 5;
    }

    public double setWidth() {
        return 5;
    }

    public double getPerimeter(double length, double width){
        return (length * 2) + (width * 2);
    }

    public double getArea(double length, double width){
        return length * width;
    }
}
