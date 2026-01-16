package objectorientedprogramming.inheritance;

class Individual {
    protected String name;
    protected int age;

    public Individual(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Individual {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}

class Student extends Individual {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }
}

class Staff extends Individual {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jason", 35, "Mathematics");
        Student student = new Student("Karthik", 16, "10th Grade");
        Staff staff = new Staff("Naveen", 40, "Administration");

        teacher.displayInfo();
        teacher.displayRole();

        System.out.println();

        student.displayInfo();
        student.displayRole();

        System.out.println();

        staff.displayInfo();
        staff.displayRole();
    }
}