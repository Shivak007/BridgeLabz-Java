package coreprogramming.methods.level3;
import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random PCM scores
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random rand = new Random();
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(61) + 40; // Physics (40-100)
            scores[i][1] = rand.nextInt(61) + 40; // Chemistry (40-100)
            scores[i][2] = rand.nextInt(61) + 40; // Maths (40-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0; // rounded to 2 digits
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to determine grade
    public static String determineGrade(double percentage) {
        if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "R";
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int maths = scores[i][2];
            double total = results[i][0];
            double average = results[i][1];
            double percentage = results[i][2];
            String grade = determineGrade(percentage);

            System.out.println((i + 1) + "\t" + physics + "\t" + chemistry + "\t\t" + maths + "\t" +
                    (int)total + "\t" + average + "\t" + percentage + "%\t\t" + grade);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);

        sc.close();
    }
}
