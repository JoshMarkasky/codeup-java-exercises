import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        int counter = 2;

        int number, result, result2;
        char grade;
        String choice, choice2;
        boolean answer = true;
        Scanner scanner = new Scanner(System.in);


//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }
//
//
//        do{
//            System.out.println(counter);
//            counter = (int) Math.pow(counter, counter);
//
//        }while(counter < 100000000);

//        for(i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//
//        for(i = 2; i <= 100000000; i = (int)Math.pow(i, i)){
//            System.out.println(i);
//        }
//
//        //FizzBuzz
//        for(i = 0; i <= 100; i++){
//            if(i%3 == 0 && i != 0){
//                if(i%5 == 0){
//                    System.out.println("FizzBuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else if(i%5 == 0 && i != 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


        // showing table
         do{

             System.out.println("What number would you like to go up to? ");
             number = scanner.nextInt();

             System.out.println("heres your table loser");
             System.out.println("number" + " | " + "squared" + " | " + "cubed" + " | ");
             System.out.println("-------"  + " " + "--------" + "  " + "--------");
             for(i = 0; i <= number; i++){
                 result = (int)Math.pow(i, 2);
                 result2 = (int)Math.pow(i, 3);

                 if(result != 0){
                     if(result2 != 0){
                         System.out.println(i + "       " + result + "          " + result2);
                     }
                 }
             }

             System.out.println("would you like to to continue? yes/no");
             choice = scanner.next();


             if(choice.charAt(0) == 'n' || choice.charAt(0) == 'N'){
                 answer = false;
             } else if(choice.charAt(0) == 'y' || choice.charAt(0) == 'Y'){
                 answer = true;
             } else {
                 System.out.println("invalid choice, will now exit");
                 System.exit(0);
             }

         }while(answer);

         //convert numbers into letter grades
        do{

            System.out.println("please enter a number to convert to letter grade");
            number = scanner.nextInt();

            if(number >= 88){
                grade = 'A';
                System.out.println(grade);
            } else if(number <= 88 && number >= 80){
                grade = 'B';
                System.out.println("your grade is: " + grade);
            } else if(number <= 79 && number >= 67){
                grade = 'C';
                System.out.println("your grade is: " + grade);
            } else if(number <= 66 && number >= 60){
                grade = 'D';
                System.out.println("your grade is: " + grade);
            } else {
                grade = 'F';
                System.out.println("your grade is: " + grade);
            }

            System.out.println("would you like to to continue? yes/no");
            choice2 = scanner.next();

            if(choice2.charAt(0) == 'n' || choice2.charAt(0) == 'N'){
                answer = false;
            } else if(choice2.charAt(0) == 'y' || choice2.charAt(0) == 'Y'){
                answer = true;
            } else {
                System.out.println("invalid choice, will now exit");
                System.exit(0);
            }

        }while(answer);

    }
}
