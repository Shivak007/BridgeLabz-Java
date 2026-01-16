package objectorientedprogramming.oopfundamentals.level1;

class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Employee's ID: " + id);
        System.out.println("Employee's Name: " + name);
        System.out.printf("Salary: ₹%.2f",salary);
    }
}

public class EmployeeDemo{
    public static void main(String[] args){
        Employee e1 = new Employee("Shiva", 774, 1000);
        Employee e2 = new Employee("Jason ", 775, 2000);
        Employee e3 = new Employee("Dinesh", 770, 1500);

        System.out.println("*** Employee 1 ***");
        e1.displayDetails();
        System.out.println("\n\n*** Employee 2 ***");
        e2.displayDetails();
        System.out.println("\n\n*** Employee 3 ***");
        e3.displayDetails();

    }
}
