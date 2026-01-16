package objectorientedprogramming.constructors.accessmodifiers;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String level;

    Manager(int employeeID, String department, double salary, String level) {
        super(employeeID, department, salary);
        this.level = level;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department +
                ", Salary: " + getSalary() + ", Level: " + level);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Manager mgr = new Manager(501, "IT", 75000, "Senior");
        mgr.setSalary(80000);
        mgr.displayDetails();
    }
}