package objectorientedprogramming.oopfundamentals.level2;
import java.util.*;

class Student{
    private String name;
    private int rollNo;
    private double marks;

    Student(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo =rollNo;
        this.marks = marks;
    }

    String calculateGrade(){
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student("Shiva", 101, 72);
        Student s2 = new Student("Jason", 102, 78);
        Student s3 = new Student("Dinesh", 103, 55);

        System.out.println("*** Student 1 ***");
        s1.displayDetails();

        System.out.println("\n*** Student 2 ***");
        s2.displayDetails();

        System.out.println("\n*** Student 3 ***");
        s3.displayDetails();
    }
}
