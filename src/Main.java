import model.Person;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Travis", 40, "unemployed");
        person.printInfo();
        System.out.println("\nPerson object: " + person + "\n");

        Student student = new Student("Askar", 16, "Samsung IT-School");
        student.birthday();
        student.printInfo();
    }
}