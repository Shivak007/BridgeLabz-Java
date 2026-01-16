package coreprogramming.string.level2;
import java.util.Random;

public class VotingEligibility {

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18 && ages[i] > 0) result[i][1] = "True";
            else result[i][1] = "False";
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("Age\tCanVote");
        System.out.println("--------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVotingEligibility(ages);
        displayTable(result);
    }
}