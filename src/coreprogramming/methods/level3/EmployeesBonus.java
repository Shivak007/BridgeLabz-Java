package coreprogramming.methods.level3;
import java.util.Random;

public class EmployeesBonus {

    public static void main(String[] args) {
        int numEmployees = 10;

        // Step 1: Generate salary and years of service for each employee
        double[][] employeeData = generateEmployeeData(numEmployees);

        System.out.println("Employee Data (Old Salary and Years of Service):");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("Employee %d: Salary = %.2f, Years of Service = %.0f\n",
                    i+1, employeeData[i][0], employeeData[i][1]);
        }

        // Step 2: Calculate bonus and new salary
        double[][] newData = calculateBonus(employeeData);

        System.out.println("\nEmployee Data (Old Salary, coreProgramming.controlFlow.Level1.Bonus, New Salary):");
        System.out.printf("%-10s %-15s %-10s %-15s\n", "Employee", "Old Salary", "coreProgramming.controlFlow.Level1.Bonus", "New Salary");
        for (int i = 0; i < numEmployees; i++) {
            System.out.printf("%-10d %-15.2f %-10.2f %-15.2f\n",
                    i+1, employeeData[i][0], newData[i][1], newData[i][0]);
        }

        // Step 3: Calculate total old salary, total new salary, and total bonus
        calculateTotals(employeeData, newData);
    }

    // Method to generate random salary (5-digit) and years of service
    public static double[][] generateEmployeeData(int num) {
        Random rand = new Random();
        double[][] data = new double[num][2];

        for (int i = 0; i < num; i++) {
            // Salary: 5-digit number between 10000 and 99999
            data[i][0] = 10000 + rand.nextInt(90000);

            // Years of service: 1 to 10 years
            data[i][1] = 1 + rand.nextInt(10);
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(double[][] data) {
        int num = data.length;
        double[][] newData = new double[num][2]; // [newSalary, bonus]

        for (int i = 0; i < num; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }

            double newSalary = oldSalary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }

        return newData;
    }

    // Method to calculate totals and display
    public static void calculateTotals(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total coreProgramming.controlFlow.Level1.Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
