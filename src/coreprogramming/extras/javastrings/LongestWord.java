package coreprogramming.extras.javastrings;
import java.util.Scanner;

public class LongestWord {
    static String findLongestWord(String str){
        String[] words = str.split(" ");
        String longest = "";

        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("The longest word is " + findLongestWord(input));
        sc.close();
    }
}
