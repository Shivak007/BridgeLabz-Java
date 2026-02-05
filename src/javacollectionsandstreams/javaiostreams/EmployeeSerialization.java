package javacollectionsandstreams.javaiostreams;
import java.io.*;
import java.util.*;

class Employee implements Serializable {
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

public class EmployeeSerialization {

    public static void main(String[] args) {

        String filePath = "data/javaiostreams/serialization/employees.dat";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Dinesh", "IT", 55000));
        employees.add(new Employee(2, "Jason", "HR", 45000));
        employees.add(new Employee(3, "Naveen", "Finance", 60000));

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully");

        } catch (IOException e) {
            System.out.println("Error during serialization");
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filePath))) {

            List<Employee> savedEmployees =
                    (List<Employee>) ois.readObject();

            System.out.println("Deserialized Employee Data:");
            for (Employee e : savedEmployees) {
                System.out.println(
                        e.id + " " +
                                e.name + " " +
                                e.department + " " +
                                e.salary
                );
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization");
        }
    }
}
