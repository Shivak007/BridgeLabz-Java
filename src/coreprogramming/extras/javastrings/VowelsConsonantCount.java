package coreprogramming.extras.javastrings;
import java.util.*;

public class VowelsConsonantCount {
    public static int[] countVAndC(String str){
        int vowels = 0, consonant = 0;
        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else consonant++;
        }
        return new int[]{vowels, consonant};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.next().trim().toLowerCase();

        System.out.println("Vowels: " + countVAndC(input)[0]);
        System.out.println("Consonants: " + countVAndC(input)[1]);

        sc.close();
    }
}
