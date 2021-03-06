package shapes;

public class ShapesTest {

    public static void main(String[] args){

        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter(double length, double width) {
                return (length + length) + (width + width);
            }

            @Override
            public double getArea(double length, double width) {
                return length * width;
            }
        };

//        System.out.println(myShape.getPerimeter(5,5));
//        System.out.println(myShape.getArea(5,5));

        Measurable myShape1 = new Square();
        Rectangle myShape2 = new Rectangle();

        System.out.println(myShape1.getArea(5,5));

    }

}
