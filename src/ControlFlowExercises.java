public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        int counter = 2;


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

        for(i = 5; i <= 15; i++){
            System.out.println(i);
        }

        for(i = 2; i <= 100000000; i = (int)Math.pow(i, i)){
            System.out.println(i);
        }

        //FizzBuzz
        for(i = 0; i <= 100; i++){
            if(i%3 == 0 && i != 0){
                if(i%5 == 0){
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if(i%5 == 0 && i != 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
