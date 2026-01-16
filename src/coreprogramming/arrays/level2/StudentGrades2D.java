package coreprogramming.arrays.level2;
import java.util.Scanner;

public class StudentGrades2D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks in " + subject + ": ");
                int mark = sc.nextInt();
                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter this student's data.");
                    i--;
                    break;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            grades[i] = getGrade(percentages[i]);
        }

        System.out.println("Physics\tChemistry\tMaths\tTotal\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            total + "\t" +
                            String.format("%.2f", percentages[i]) + "\t" +
                            grades[i]
            );
        }

        sc.close();
    }
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }
}