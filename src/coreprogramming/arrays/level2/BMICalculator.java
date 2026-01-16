package coreprogramming.arrays.level2;
import java.util.Arrays;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of person: ");
        int person = sc.nextInt();

        double[] weights = new double[person];
        double[] heights = new double[person];
        double[] bmis = new double[person];
        String[] bmiStatus = new String[person];

        for(int i = 0; i < person; i++){
            System.out.println("Enter for person " + (i+1) + ":");
            System.out.print("Enter weight (in kgs): ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter the height (in m): ");
            heights[i] = sc.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);
            bmiStatus[i] = status(bmis[i]);
        }

        System.out.println("Height \tWeight \tBMI \tStatus ");
        for(int j = 0; j < person; j++){
            System.out.printf("%.1f \t%.2f \t%.1f \t%s",heights[j], weights[j], bmis[j], bmiStatus[j]);
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