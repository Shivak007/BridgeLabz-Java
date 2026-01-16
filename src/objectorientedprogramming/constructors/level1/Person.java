package objectorientedprogramming.constructors.level1;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(Person others){
        this.name = others.name;
        this.age = others.age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

}
