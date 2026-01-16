package objectorientedprogramming.constructors.accessmodifiers;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name +
                ", CGPA: " + getCGPA() + ", Specialization: " + specialization);
    }
}

public class University {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(774, "Shiva", 8.6, "Computer Science");
        pg.displayDetails();
    }
}