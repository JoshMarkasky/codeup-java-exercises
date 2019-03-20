import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){

        double pi = 3.14159;
        int answer, answerA, answer2, L, W;
        String word1, word2, word3;
        String sentence;

        Scanner scanner = new Scanner(System.in);

        System.out.format("the value of pie is %s", pi);
        
        System.out.println("\n enter a number \n");
        answer = scanner.nextInt();

        System.out.format("the number you enter is: %s\n", answer );

        System.out.println("now enter three words \n");

        word1 = scanner.next();
        word2 = scanner.next();
        word3 = scanner.next();

        System.out.println("your words are: \n" + word1 + "\n" + word2 + "\n" + word3 + "\n");
        System.out.format("your words are:\n %s\n %s\n %s\n", word1, word2, word3);

        System.out.println("\nnow enter a sentence");

        sentence = scanner.nextLine();

        System.out.format("your input is: %s \n", sentence);

        System.out.println("enter width and length \n");

        W = scanner.nextInt();
        L = scanner.nextInt();

        answerA = W * L;
        answer2 = (W + W) + (L + L);

        System.out.println("area: " + answerA + "perimeter: " + answer2);

    }

}
