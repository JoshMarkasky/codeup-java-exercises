package shapes;
import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args){

        double input;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("please enter radius");
        input = keyboard.nextDouble();
        Circle newCircle = new Circle(input);

        System.out.println(newCircle.getArea());
        System.out.println(newCircle.getCircumference());

    }

}
