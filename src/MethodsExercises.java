import java.util.Scanner;

public class MethodsExercises {

    // start of add,subtract, multiply, divide, modulus
    public static void add(int num1, int num2){
        int answer = num1 + num2;
        System.out.println(answer);
    }

    public static void subtract(int num1, int num2){
        int answer = num1 - num2;
        System.out.println(answer);
    }

    public static void multi(int num1, int num2){
        int answer = num1 * num2;
        System.out.println(answer);
    }

    public static void divide(int num1, int num2){
        int answer = num1 / num2;
        System.out.println(answer);
    }

    public static void modulus(int num1, int num2){
        int answer = num1 % num2;
        System.out.println(answer);
    } // end of add,subtract, multiply, divide, modulus

    // checking input Integer
    public static void getInteger(int input){
        int min = 0;
        int max = 10;

        if (input > max || input < min) {
            System.out.println("invalid choice");
        } else {
            factorial(input);
        }

    }

    // converting input number into factorial
    public static int factorial(int n){
        if (n == 0) {
            return 1;
        }else {
            int answer = n * factorial(n-1);
            System.out.println(answer);
            return answer;
        }
    }

    //generate random numbers for dice game
    public static int random(int input){
        int dice1 = (int) Math.round(Math.random() * input + 1);
        int dice2 = (int) Math.round(Math.random() * input + 1);
        System.out.println("dice one is: " + dice1 + "\n" + "dice 2 is: " + dice2);
        return dice1 + dice2;
    }

    public static void main(String[] args){

        // calling math methods
        add(5, 5);
        subtract(5, 5);
        multi(5, 5);
        divide(5, 5);
        modulus(5, 5);

        // declaring vars
        int input;
        boolean keepGoing = true;
        String choice;
        Scanner keyboard = new Scanner(System.in);

        /* ------ start of do while loop for factorial of a number ----------------------*/
        do {

            System.out.println("Enter a number between 1 and 10: ");
            input = keyboard.nextInt();


            getInteger(input);


            System.out.println("do you want to enter a different number?");
            choice = keyboard.next();

            if(choice.charAt(0) == 'n' || choice.charAt(0) == 'N'){
                System.out.println("program has ended");
                keepGoing = false;
            } else if(choice.charAt(0) == 'y' || choice.charAt(0) == 'Y'){
                keepGoing = true;
            } else {
                System.out.println("invalid choice, program will end");
                keepGoing = false;
            }

        } while(keepGoing); // end of do while loop and program


       /* ----------------------  start of dice game ----------------------*/
        //declaring vars
        int sides;
        boolean keepGoing2;
        String choice2;

        do {

            System.out.println("how many sides do the two dice have?");
            sides = keyboard.nextInt();

            random(sides);

        System.out.println("do you want to play dice game?");
        choice2 = keyboard.next();

        if(choice2.charAt(0) == 'n' || choice2.charAt(0) == 'N'){
            System.out.println("program has ended");
            keepGoing2 = false;
        } else if(choice2.charAt(0) == 'y' || choice2.charAt(0) == 'Y'){
            keepGoing2 = true;
        } else {
            System.out.println("invalid choice, program will end");
            keepGoing2 = false;
        }

        }while(keepGoing2);

        /* -----------------  HighLow game -------------- */
        boolean keepGoing3;
        String choice3;
        do {
            int number = (int) Math.round(Math.random() * 100 + 1);
            int guess;
            int counter = 0;

            System.out.println("guess a number between 1 and 100");

            do {
                guess =  keyboard.nextInt();
                if(guess > number){
                    System.out.println("lower");
                    counter++;
                } else if (guess < number){
                    System.out.println("higher");
                    counter++;
                } else if (guess == number){
                    System.out.println("good guess!! you won! it took you " + counter + " guesses");
                }

            } while (guess != number);

            System.out.println("do you want to play highLow game again?");
            choice3 = keyboard.next();

            if(choice3.charAt(0) == 'n' || choice3.charAt(0) == 'N'){
            System.out.println("program has ended");
            keepGoing3 = false;
            } else if(choice3.charAt(0) == 'y' || choice3.charAt(0) == 'Y'){
            keepGoing3 = true;
            } else {
            System.out.println("invalid choice, program will end");
            keepGoing3 = false;
            }

        } while(keepGoing3);

    }
}
