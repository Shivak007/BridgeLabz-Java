package coreprogramming.string.level3;
import java.util.*;

public class UniqueCharacters {
    static int computeLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch (Exception e){
            return count;
        }
    }

    static char[] uniqueCharacters(String str){
        int len = computeLength(str);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next().trim().toLowerCase();

        System.out.println(Arrays.toString(uniqueCharacters(input)));
        sc.close();
    }
}
