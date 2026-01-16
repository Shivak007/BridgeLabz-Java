package coreprogramming.arrays.level2;
import java.util.Scanner;

public class MultiDimensionalBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of person: ");
        int person = sc.nextInt();

        double[][] personData = new double[person][3];
        String[] bmiStatus = new String[person];

        for (int i = 0; i < person; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            double weight;
            do {
                System.out.print("Enter weight (in kgs): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            double height;
            do {
                System.out.print("Enter height (in m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (height <= 0);

            double bmi = weight / (height * height);

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
            bmiStatus[i] = status(bmi);
        }

        System.out.println();
        System.out.println("Height \tWeight \tBMI \tStatus ");
        for(int j = 0; j < person; j++){
            System.out.printf("%.2f \t%.2f \t%.1f \t%s",personData[j][0], personData[j][1], personData[j][2], bmiStatus[j]);
            System.out.println();
        }

        sc.close();
    }
    public static String status(double bmi){
        if(bmi < 18.5) return "Underweight";
        else if(bmi < 25) return "Normal";
        else if(bmi < 40) return "Overweight";
        else return "Obese";
    }
}