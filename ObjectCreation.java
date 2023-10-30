
class Person {
    
    String name;
    int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
       
        Person person1 = new Person("Farhan", 30);
        Person person2 = new Person("Belgaumi", 25);

       
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}
