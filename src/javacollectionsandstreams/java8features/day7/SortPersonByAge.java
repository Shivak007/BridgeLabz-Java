package javacollectionsandstreams.java8features.day7;
import java.util.*;

class Person {
    String name;
    int age;
    double salary;

    Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class SortPersonByAge {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Jason", 22, 50000),
                new Person("Dinesh", 21, 40000),
                new Person("Shiva", 25, 60000)
        );

        people.sort((p1, p2) -> p1.age - p2.age);

        people.forEach(p -> System.out.println(p.name + " " + p.age));
    }
}

