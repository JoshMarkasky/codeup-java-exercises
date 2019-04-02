package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args){

        HashMap <String, Object> students = new HashMap<>();
        Scanner keyboard = new Scanner(System.in);
        String choice2, choice;

        Student student1 = new Student("random1", 70);
        Student student2 = new Student("random2", 80);
        Student student3  = new Student("random3", 60);
        Student student4 = new Student("random4", 50);

        student1.addGrades(25);
        student1.addGrades(100);

        student2.addGrades(60);
        student2.addGrades(70);

        student3.addGrades(80);
        student3.addGrades(90);

        student4.addGrades(70);
        student4.addGrades(80);

        students.put("randomusername1@whatever.com", student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);
        students.put(student4.getName(), student4);

        System.out.println("Welcome");
        System.out.println("Here are the github usernames of our students:");

        for(String str : students.keySet()){
            System.out.println(str);
        }


        do {

            System.out.println("which student would you like to see information on??");
            choice = keyboard.next();

            if(choice.equals("random1")){
                System.out.println(student1.getName() + "\naverage is: " + student1.getGradesAverage(student1.getGrades()));
            } else if (choice.equals("random2")){
                System.out.println(student2.getName() + "\naverage is: " + student2.getGradesAverage(student2.getGrades()));
            } else if (choice.equals("random3")){
                System.out.println(student3.getName() + "\naverage is: " + student3.getGradesAverage(student3.getGrades()));
            } else if (choice.equals("random4")){
                System.out.println(student4.getName() + "\naverage is: " + student4.getGradesAverage(student4.getGrades()));
            }


            System.out.println("Would you like to see another student?");
            choice2 = keyboard.next();

        } while(choice2.charAt(0) == 'y');
        
        System.out.println("program ended");
    }

}
