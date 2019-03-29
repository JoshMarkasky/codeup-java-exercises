package util;
import java.util.Scanner;

public class Input {

    private Scanner keyboard = new Scanner(System.in);

    public String getString(String input){
        System.out.println("you entered: " + input);
        return "you entered: " +  input;
    }

    public boolean yesNo(String input){
        if (input.charAt(0) == 'n' || input.charAt(0) == 'N') {
            return false;
        } else if (input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
            return true;
        } else {
            System.out.println("not a valid answer, please re-think your existence");
            return true;
        }

    }

    public int getInt(int min, int max){
        int input = keyboard.nextInt();
        boolean keepGoing = true;

        do {
            if (input < min || input > max) {
                System.out.println("your answer is ether to big or small, please re-enter a valid int");
            } else {
                keepGoing = false;
            }
        }while(keepGoing);
        return input;
    }

    public double getDouble(double min, double max){
        double input = keyboard.nextDouble();
        boolean keepGoing = true;
        do {
            if (input < min || input > max) {
                System.out.println("your answer is ether to big or small, please re-enter a valid int");
            } else {
                keepGoing = false;
            }
        }while(keepGoing);
        return input;
    }


}
