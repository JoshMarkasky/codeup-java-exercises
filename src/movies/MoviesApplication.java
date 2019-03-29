package movies;
import java.util.Scanner;
import java.util.Arrays;
import java.awt.*;

public class MoviesApplication {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Movie movie[] = MoviesArray.findAll();
        Boolean keepGoing = true;
        int choice;
        String animated = "animated";
        String drama = "drama";
        String horror = "horror";
        String scifi = "scifi";
        String choice2;

        do {
            System.out.println("what would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");

            choice = keyboard.nextInt();
            System.out.println("your choice is: " + choice);

            for (int i = 0; i < movie.length; i++) {
                if (choice == 1) {
                    System.out.println(movie[i].getName());
                } else if (choice == 2) {
                    if (animated.equals(movie[i].getCategory())) {
                        System.out.println(movie[i].getName());
                    }
                } else if (choice == 3) {
                    if (drama.equals(movie[i].getCategory())) {
                        System.out.println(movie[i].getName());
                    }
                } else if (choice == 4) {
                    if (horror.equals(movie[i].getCategory())) {
                        System.out.println(movie[i].getName());
                    }
                } else if (choice == 5) {
                    if (scifi.equals(movie[i].getCategory())) {
                        System.out.println(movie[i].getName());
                    }
                }
            }


            System.out.println("do you want to do it again?");
            choice2 = keyboard.next();
            
        }while(choice2.charAt(0) == 'y' || choice2.charAt(0) == 'Y');

        System.out.println("program ended");
        
    } // end of method main

} // end of class
