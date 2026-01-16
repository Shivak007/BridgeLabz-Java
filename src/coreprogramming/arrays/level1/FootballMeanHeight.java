package coreprogramming.arrays.level1;
import java.util.Scanner;

public class FootballMeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter the heights of 11 football players (space-separated):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean height of the football team = " + mean);

        sc.close();
    }
}