package grades;
import java.awt.*;
import java.util.*;

public class Student {

    private String name;
//    private int[] grades;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name, int grades) {

        this.name = name;
        this.grades.add(grades);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrades(int grades) {
        this.grades.add(grades);
    }

    public int getGradesAverage(ArrayList<Integer> grades) {

        int total = 0;
        int avg = 0;

        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
            avg = total / grades.size();
        }
        System.out.println("you avg is:");
        return  avg;
    }

    public static void main(String[] args){

        Student josh = new Student("josh", 45);

        josh.addGrades(86);
        josh.addGrades(56);
        josh.addGrades(77);

        System.out.println(josh.getGradesAverage(josh.getGrades()));

    }

}
