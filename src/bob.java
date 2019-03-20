import java.util.Scanner;

public class bob {
    public static void main(String[] args){

        boolean keepGoing = true;
        String input, choice;
        Scanner keyboard = new Scanner(System.in);



         do {
             System.out.println("ask bob a question");

             input = keyboard.nextLine();

                if(input.isEmpty()){
                    System.out.println("bob says: 'Fine, Be that way'");
                } else if(input.charAt(input.length() -1) == '?'){
                    System.out.println("bob says: 'sure' ");
                } else if(input.charAt(input.length() -1) == '!'){
                    System.out.println("bob says: 'dont Yell at Me!!!'");
                } else {
                    System.out.println("bob says: 'whatever'");
                }



             System.out.println("do you want to ask bob a another question?");

             choice = keyboard.nextLine();

             if(choice.charAt(0) == 'n'){
                System.out.println("bob says: 'Peace out blood' \n bob has left the building");
                keepGoing = false;
             } else if(choice.charAt(0) == 'y'){
                System.out.println("ask your question then foo");
                keepGoing = true;
             } else {
                 System.out.println("not a vaild question \n bob is mad now and leaving");
                 keepGoing = false;
             }


         } while (keepGoing);

        

    }
}
