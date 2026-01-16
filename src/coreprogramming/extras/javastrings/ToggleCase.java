package coreprogramming.extras.javastrings;
import java.util.Scanner;

public class ToggleCase {
    static String convertCases(String str){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }else{
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        System.out.println("Toggle Case: " + convertCases(input));
        sc.close();
    }
}
