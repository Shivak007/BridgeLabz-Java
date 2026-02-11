package javacollectionsandstreams.java8features.day8;
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeDataProcessing {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Shiva", "Engineering", 90000),
                new Employee(2, "Kushal", "Engineering", 85000),
                new Employee(3, "Hrithik", "HR", 70000),
                new Employee(4, "Jason", "Engineering", 75000),
                new Employee(5, "Naveen", "Engineering", 95000)
        );

        Map<String, Double> result =
                employees.stream()
                        .filter(e -> e.department.equals("Engineering") && e.salary > 80000)
                        .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                        .collect(Collectors.groupingBy(
                                e -> e.department,
                                Collectors.averagingDouble(e -> e.salary)
                        ));

        result.forEach((dept, avgSalary) ->
                System.out.println(dept + " Avg Salary: " + avgSalary));
    }
}
