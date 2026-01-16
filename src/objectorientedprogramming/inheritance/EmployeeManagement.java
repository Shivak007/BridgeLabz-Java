package objectorientedprogramming.inheritance;

class Employee{
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team size: " + teamSize);
    }
}

class Developer extends Employee{
    private String programmingLang;

    Developer(String name, int id, double salary, String programmingLang){
        super(name,id,salary);
        this.programmingLang = programmingLang;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Languages: " + programmingLang);
    }
}

class Intern extends Employee{
    private int duration;

    Intern(String name, int id, double salary, int duration){
        super(name,id,salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Duration: " + duration + " months");
    }
}

public class EmployeeManagement {
    public static void main(String[] args){
        Employee manager = new Manager("Dinesh", 1082,85000, 12);
        Employee int1 = new Intern("Shiva", 2877, 35000, 4);
        Employee int2 = new Intern("Akshayaa", 2832, 40000, 2);
        Employee developer = new Developer("Jason Rajan", 2386, 65000, "Python");

        System.out.println("Manager");
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer");
        developer.displayDetails();
        System.out.println();

        System.out.println("Interns");
        int1.displayDetails();
        System.out.println();
        int2.displayDetails();
    }
}
