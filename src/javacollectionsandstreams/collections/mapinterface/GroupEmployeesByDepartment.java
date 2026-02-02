package javacollectionsandstreams.collections.mapinterface;
import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for employee " + i);

            System.out.print("Employee name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            map.computeIfAbsent(dept, k -> new ArrayList<>()).add(name);
        }

        System.out.println(map);
    }
}
