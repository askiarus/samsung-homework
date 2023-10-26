package model;

public class Person {
    private String name = "";
    private int age = 0;
    private String occupation = "";

    public Person(String name, int age, String occupation) {
        this.name = name;
        if(age >= 0 && age < 200) {
            this.age = age;
        }
        this.occupation = occupation;
    }
    public void printInfo() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nOccupation: " + this.occupation);
    }
}