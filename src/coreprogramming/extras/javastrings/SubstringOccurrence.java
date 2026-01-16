package coreprogramming.extras.javastrings;
import java.util.Scanner;

public class SubstringOccurrence {
    static int countOccurrences(String str, String sub){
        int count = 0,index =0;
        while((index = str.indexOf(sub,index)) != -1){
            count++;
            index = index + sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int result = countOccurrences(text, sub);
        System.out.println("Occurrences of \"" + sub + "\": " + result);

        sc.close();
    }

}
