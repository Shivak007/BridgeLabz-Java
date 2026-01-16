package coreprogramming.string.level2;
import java.util.Random;

public class StudentScorecard {

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60;
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 300.0) * 10000.0) / 100.0;
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        System.out.println("Stu\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int)results[i][0] + "\t" +
                    String.format("%.2f", results[i][1]) + "\t" +
                    String.format("%.2f", results[i][2]));
        }
    }
}