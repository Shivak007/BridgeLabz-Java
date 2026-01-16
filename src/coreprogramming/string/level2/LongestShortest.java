package coreprogramming.string.level2;
import java.util.Scanner;

public class LongestShortest {
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length()); // using built-in length
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordTable) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(wordTable[0][1]);
        int maxLen = Integer.parseInt(wordTable[0][1]);

        for (int i = 1; i < wordTable.length; i++) {
            int length = Integer.parseInt(wordTable[i][1]);
            if (length < minLen) {
                minLen = length;
                minIndex = i;
            }
            if (length > maxLen) {
                maxLen = length;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        String[][] wordTable = wordsWithLengths(words);
        int[] result = findShortestAndLongest(wordTable);

        for (int i = 0; i < wordTable.length; i++) {
            System.out.println(wordTable[i][0] + "\t" + Integer.parseInt(wordTable[i][1]));
        }

        System.out.println("\nShortest word: " + wordTable[result[0]][0] +
                " (Length: " + wordTable[result[0]][1] + ")");
        System.out.println("Longest word: " + wordTable[result[1]][0] +
                " (Length: " + wordTable[result[1]][1] + ")");
        sc.close();
    }
}
