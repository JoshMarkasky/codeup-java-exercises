package util;
import java.util.Scanner;


public class InputTest {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Input one = new Input();
        String input, choice;
        boolean keepgoing;

         
        System.out.println("please enter something");
        input = keyboard.next();

        one.getString(input);



        choice = keyboard.next();
        one.yesNo(choice);
        one.getInt(1, 10);
        one.getDouble(1, 10);


             




    }

}
