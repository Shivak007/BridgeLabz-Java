package coreprogramming.extras.javastrings;
import java.util.*;

public class MostFrequent {
    static char findMostFrequentChar(String str){
        int[] freq = new int[256];

        for(int i = 0; i <str.length(); i++){
            freq[str.charAt(i)]++;
        }

        int mostFreq = -1;
        char result = ' ';

        for(int i = 0; i < 256; i++){
            if (freq[i] > mostFreq){
                mostFreq = freq[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findMostFrequentChar(input);
        System.out.println("Most frequent character: " + result);

        sc.close();
    }
}
