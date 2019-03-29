package shapes;

public class Circle {

    private double radius;
    private static double Pi = 3.14159265359;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (Pi * radius) * 2;
    }

    public double getCircumference() {
       return (2 * Pi) * radius;
    }

}
