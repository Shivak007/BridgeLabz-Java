package coreprogramming.string.level3;
import java.util.*;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeatChar(String str){
        int[] freq = new int[256];

        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i)]++;
        }

        for(int i = 0 ; i < str.length(); i++){
            if(freq[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.next().trim().toLowerCase();

        char ch = findFirstNonRepeatChar(input);
        if(ch != '\0'){
            System.out.println("The first non-repeating character is " + ch);
        }else{
            System.out.println("No non-repeating character is found");
        }

        sc.close();
    }
}
