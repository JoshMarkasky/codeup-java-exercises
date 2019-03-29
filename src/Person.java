public class Person {

        public String name;

        public Person(String personName){
            name = personName;
            System.out.println("new person is created");
        }

        public String setName(String input){
            name = input;
            return name + " ";
        }

        public String getName(){
            return "this persons name is " + name;
        }

        public static void main(String[] args){

            Person newPerson = new Person("Josh");
            System.out.println(newPerson.setName("new Name") + newPerson.getName());

//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());
//            person2.setName("Jane");
//            System.out.println(person1.getName());
//            System.out.println(person2.getName());

        }


}
