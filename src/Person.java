class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main1 {
    // Method that takes an object of Person class as a parameter
    public static void greetPerson(Person person) {
        System.out.println("Hello, " + person.getName() + "!");
    }

    public static void main(String[] args) {
        // Create an object of Person class
        Person person = new Person("Alice");

        // Pass the object as a parameter to the method
        greetPerson(person);
    }
}
