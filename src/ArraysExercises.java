import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newGuy){
        Person[] newArray = Arrays.copyOf(array, array.length + 1);
        Arrays.fill(newArray, newGuy);
        return newArray;
    }

    public static void main(String[] args){

        Person[] persons = new Person[4];
        Person person1 = new Person("Josh");
        Person person2 = new Person("RandomName1");
        Person person3 = new Person("randomName2");
        Person person4 = new Person("randomName3");
        Person newguy = new Person("thisGuy");


        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;
        persons[3] = person4;

        addPerson(persons, newguy);

        for(int i = 0; i < persons.length; i++){
            System.out.println(persons[i].getName());
        }


    }

}
